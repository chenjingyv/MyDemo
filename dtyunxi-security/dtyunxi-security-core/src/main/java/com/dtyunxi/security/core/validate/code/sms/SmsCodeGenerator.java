/**
 * Copyright (C), 2016-2019, 云徙科技
 * FileName: SmsCodeGenerator
 * Author:   Administrator
 * Date:     2019/12/1 11:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dtyunxi.security.core.validate.code.sms;

import com.dtyunxi.security.core.properties.SecurityProperties;
import com.dtyunxi.security.core.validate.code.ValidateCode;
import com.dtyunxi.security.core.validate.code.ValidateCodeController;
import com.dtyunxi.security.core.validate.code.ValidateCodeGenerator;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.web.HttpSessionSessionStrategy;
import org.springframework.social.connect.web.SessionStrategy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * 〈〉
 *
 * @author Administrator
 * @create 2019/12/1
 * @since 1.0.0
 */
@Component("smsValidateCodeGenerator")
public class SmsCodeGenerator implements ValidateCodeGenerator {

    @Autowired
    @SuppressWarnings("all")
    private SecurityProperties securityProperties;

    private SessionStrategy sessionStrategy = new HttpSessionSessionStrategy();

    @Override
    public ValidateCode generator(ServletWebRequest request) {
        String code = RandomStringUtils.randomNumeric(securityProperties.getCode().getSms().getLength());
        sessionStrategy.setAttribute(request, ValidateCodeController.SESSION_KEY_SMS_CODE,code);
        return new ValidateCode(code,securityProperties.getCode().getSms().getExpireIn());
    }
}