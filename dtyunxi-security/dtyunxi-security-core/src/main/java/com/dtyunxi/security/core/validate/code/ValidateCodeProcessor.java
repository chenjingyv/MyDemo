/**
 * Copyright (C), 2016-2019, 云徙科技
 * FileName: ValidateCodeProcessor
 * Author:   Administrator
 * Date:     2019/12/1 17:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dtyunxi.security.core.validate.code;

import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * 〈验证码处理器接口〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2019/12/1
 * @since 1.0.0
 */
public interface ValidateCodeProcessor {

    String SESSION_KEY_PREFIX = "DEFAULT_PARAMETER_NAME_CODE_";

    void create(ServletWebRequest request) throws Exception;

    void validate(ServletWebRequest request) throws ServletRequestBindingException;
}