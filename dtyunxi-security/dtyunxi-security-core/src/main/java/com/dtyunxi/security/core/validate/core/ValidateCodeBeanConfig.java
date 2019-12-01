/**
 * Copyright (C), 2016-2019, 云徙科技
 * FileName: ValidateCodeConfig
 * Author:   Administrator
 * Date:     2019/11/30 23:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dtyunxi.security.core.validate.core;

import com.dtyunxi.security.core.properties.SecurityProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * 〈〉
 *
 * @author Administrator
 * @create 2019/11/30
 * @since 1.0.0
 */
/**
 * 图形校验配置类
 *
 * @author lwj
 */
@Configuration
public class ValidateCodeBeanConfig {

    @Autowired
    @SuppressWarnings("all")
    private SecurityProperties securityProperties;

    @Bean
    @ConditionalOnMissingBean(name = "imageCodeGenerator")
    public ValidateCodeGenerator imageCodeGenerator() {
        ImageCodeGenerator imageCodeGenerator = new ImageCodeGenerator();
        imageCodeGenerator.setSecurityProperties(securityProperties);
        return imageCodeGenerator;
    }
}