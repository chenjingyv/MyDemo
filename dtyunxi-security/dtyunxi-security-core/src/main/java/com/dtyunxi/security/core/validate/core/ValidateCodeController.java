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
package com.dtyunxi.security.core.validate.core;

import com.dtyunxi.security.core.properties.SecurityProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.web.HttpSessionSessionStrategy;
import org.springframework.social.connect.web.SessionStrategy;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

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
    private ValidateCodeGenerator validateCodeGenerator;

    @Autowired
    @SuppressWarnings("all")
    private SecurityProperties securityProperties;

    public final static String SESSION_KEY_IMAGE_CODE ="imageCode";

    @RequestMapping("/authentication/image")
    public void getImageCode(HttpServletResponse response, HttpServletRequest request) throws IOException {
        ImageCode imageCode = validateCodeGenerator.createImageCode(request);
        sessionStrategy.setAttribute(new ServletWebRequest(request),SESSION_KEY_IMAGE_CODE,imageCode);
//        request.getSession().setAttribute(SESSION_KEY_IMAGE_CODE,imageCode);
        ImageIO.write(imageCode.getImage(), "JPEG", response.getOutputStream());
    }


}