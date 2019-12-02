/**
 * Copyright (C), 2016-2019, 云徙科技
 * FileName: ValidateCodeException
 * Author:   Administrator
 * Date:     2019/11/30 17:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dtyunxi.security.core.validate.code;

import org.springframework.security.core.AuthenticationException;

/**
 *
 * 〈〉
 *
 * @author Administrator
 * @create 2019/11/30
 * @since 1.0.0
 */
public class ValidateCodeException extends AuthenticationException {

    public ValidateCodeException(String cause) {
        super(cause);
    }
}