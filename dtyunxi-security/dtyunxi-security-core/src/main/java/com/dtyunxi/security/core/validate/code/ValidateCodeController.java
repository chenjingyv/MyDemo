/**
 * Copyright (C), 2016-2019, 云徙科技
 * FileName: ImageController
 * Author:   Administrator
 * Date:     2019/11/30 15:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dtyunxi.security.core.validate.code;

import com.dtyunxi.security.core.properties.SecurityProperties;
import com.dtyunxi.security.core.validate.code.image.ImageCode;
import com.dtyunxi.security.core.validate.code.sms.SmsCodeSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.web.HttpSessionSessionStrategy;
import org.springframework.social.connect.web.SessionStrategy;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * 〈〉
 *
 * @author Administrator
 * @create 2019/11/30
 * @since 1.0.0
 */
@RestController
public class ValidateCodeController {

    private SessionStrategy sessionStrategy = new HttpSessionSessionStrategy();

    @Autowired
    private ValidateCodeGenerator imageValidateCodeGenerator;

    @Autowired
    private ValidateCodeGenerator smsValidateCodeGenerator;

    @Autowired
    private SmsCodeSender smsCodeSender;

    @Autowired
    @SuppressWarnings("all")
    private SecurityProperties securityProperties;

    public final static String SESSION_KEY_IMAGE_CODE ="imageCode";
    public final static String SESSION_KEY_SMS_CODE ="smsCode";

    @RequestMapping("/code/image")
    public void getImageCode(HttpServletResponse response, HttpServletRequest request) throws IOException {
        ImageCode imageCode =(ImageCode)imageValidateCodeGenerator.generator(new ServletWebRequest(request));
        sessionStrategy.setAttribute(new ServletWebRequest(request),SESSION_KEY_IMAGE_CODE,imageCode);
        ImageIO.write(imageCode.getImage(), "JPEG", response.getOutputStream());
    }

    @RequestMapping("/code/sms")
    public void getSmsCode(HttpServletResponse response, HttpServletRequest request) throws IOException, ServletRequestBindingException {
        ValidateCode validateCode = smsValidateCodeGenerator.generator(new ServletWebRequest(request));
        sessionStrategy.setAttribute(new ServletWebRequest(request),SESSION_KEY_SMS_CODE,validateCode);
        smsCodeSender.send(ServletRequestUtils.getRequiredStringParameter(request,"mobile"),validateCode.getCode());
    }

}