/**
 * Copyright (C), 2016-2019, 云徙科技
 * FileName: AbstractValidateCodeProcessor
 * Author:   Administrator
 * Date:     2019/12/1 18:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dtyunxi.security.core.validate.code;

import com.dtyunxi.security.core.properties.SecurityConstants;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.web.HttpSessionSessionStrategy;
import org.springframework.social.connect.web.SessionStrategy;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.request.ServletWebRequest;

import java.util.Map;


/**
 * 〈〉
 *
 * @author Administrator
 * @create 2019/12/1
 * @since 1.0.0
 */
public abstract class AbstractValidateCodeProcessor<C extends ValidateCode> implements ValidateCodeProcessor {

    private SessionStrategy sessionStrategy = new HttpSessionSessionStrategy();

    @Autowired
    private Map<String,ValidateCodeGenerator> validateCodeGeneratorMap;

    @Override
    public void create(ServletWebRequest request) throws Exception {
        C validateCode = generator(request);
        save(request, validateCode);
        send(request, validateCode);
    }

    public C generator(ServletWebRequest request) {
        String type = getValidateCodeType().toString().toLowerCase();
        String generatorName = type + ValidateCodeGenerator.class.getSimpleName();
        ValidateCode validateCode = validateCodeGeneratorMap.get(generatorName).generator(request);
        return (C)validateCode;
    }

    public void save(ServletWebRequest request, C validateCode) {
        sessionStrategy.setAttribute(request, getSessionKey(), validateCode);
    }

    public String getSessionKey() {
        return SESSION_KEY_PREFIX +getValidateCodeType().toString();
    }

    public ValidateCodeType getValidateCodeType() {
        String type = StringUtils.substringBefore(getClass().getSimpleName(), "CodeProcessor");
        return ValidateCodeType.valueOf(type.toUpperCase());
    }

    @Override
    public void validate(ServletWebRequest request) throws ServletRequestBindingException {
        String sessionKey = getSessionKey();
        ValidateCodeType validateCodeType = getValidateCodeType();
        C codeInSession = (C)sessionStrategy.getAttribute(request,sessionKey );
        String codeInRequest = ServletRequestUtils.getRequiredStringParameter(request.getRequest(),
                validateCodeType.toString().toLowerCase() + SecurityConstants.DEFAULT_VALIDATE_CODE_URL_PREFIX);
        if(codeInRequest == null){
            throw new ValidateCodeException("验证码不能为空");
        }
        if(codeInSession == null){
            throw new ValidateCodeException("验证码不存在");
        }
        if(codeInSession.isExpried()){
            sessionStrategy.removeAttribute(request,sessionKey);
            throw new ValidateCodeException("验证码已过期");
        }
        if(!StringUtils.equalsIgnoreCase(codeInRequest,codeInSession.getCode())){
            throw new ValidateCodeException("验证码错误");
        }
        sessionStrategy.removeAttribute(request,sessionKey);
    }

    public abstract void send(ServletWebRequest request, C validateCode);


}