/**
 * Copyright (C), 2016-2019, 云徙科技
 * FileName: SecurityPropertie
 * Author:   Administrator
 * Date:     2019/11/24 21:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dtyunxi.security.core.properties;

import com.dtyunxi.security.core.validate.core.ValidateCodeController;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * 〈〉
 *
 * @author Administrator
 * @create 2019/11/24
 * @since 1.0.0
 */
@ConfigurationProperties(prefix="dtyunxi.security")
public class SecurityProperties {

    private BrowserProperties browser = new BrowserProperties();

    private ValidateCodeProperties code = new ValidateCodeProperties();


    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }

    public ValidateCodeProperties getCode() {
        return code;
    }

    public void setCode(ValidateCodeProperties code) {
        this.code = code;
    }
}