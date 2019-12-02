/**
 * Copyright (C), 2016-2019, 云徙科技
 * FileName: ImageCodeProcessor
 * Author:   Administrator
 * Date:     2019/12/1 22:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dtyunxi.security.core.validate.code.image;

import com.dtyunxi.security.core.validate.code.AbstractValidateCodeProcessor;
import com.dtyunxi.security.core.validate.code.ValidateCode;
import com.dtyunxi.security.core.validate.code.ValidateCodeGenerator;
import com.dtyunxi.security.core.validate.code.ValidateCodeProcessor;
import org.springframework.web.context.request.ServletWebRequest;

/**
 *
 * 〈〉
 *
 * @author Administrator
 * @create 2019/12/1
 * @since 1.0.0
 */
public class ImageCodeProcessor extends AbstractValidateCodeProcessor {

    @Override
    public void send(ServletWebRequest request, ValidateCode validateCode) {

    }
}