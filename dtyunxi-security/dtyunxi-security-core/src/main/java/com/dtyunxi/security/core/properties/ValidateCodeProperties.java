/**
 * Copyright (C), 2016-2019, 云徙科技
 * FileName: ValidateCodeProperties
 * Author:   Administrator
 * Date:     2019/11/30 21:18
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dtyunxi.security.core.properties;

/**
 *
 * 〈〉
 *
 * @author Administrator
 * @create 2019/11/30
 * @since 1.0.0
 */

public class ValidateCodeProperties {
    private ImageCodeProperties image = new ImageCodeProperties();

    private String url;

    public ImageCodeProperties getImage() {
        return image;
    }

    public void setImage(ImageCodeProperties image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}