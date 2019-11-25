/**
 * Copyright (C), 2016-2019, 云徙科技
 * FileName: SecurityCoreProperties
 * Author:   Administrator
 * Date:     2019/11/24 23:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dtyunxi.security.core;

import com.dtyunxi.security.core.properties.SecurityProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * 〈〉
 *
 * @author Administrator
 * @create 2019/11/24
 * @since 1.0.0
 */
@Component
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityCoreProperties {

}