/**
 * Copyright (C), 2016-2019, 云徙科技
 * FileName: ValidateCodeGenerator
 * Author:   Administrator
 * Date:     2019/11/30 22:43
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dtyunxi.security.core.validate.core;

import javax.servlet.http.HttpServletRequest;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/11/30
 * @since 1.0.0
 */
public interface ValidateCodeGenerator {
    ImageCode createImageCode(HttpServletRequest request);
}