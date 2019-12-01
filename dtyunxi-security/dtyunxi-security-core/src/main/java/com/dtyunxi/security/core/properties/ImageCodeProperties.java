/**
 * Copyright (C), 2016-2019, 云徙科技
 * FileName: ImageProperties
 * Author:   Administrator
 * Date:     2019/11/30 20:50
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

public class ImageCodeProperties {
    private int width = 65;
    /**
     * 长度
     */
    private int height = 40;
    /**
     * 验证码长度
     */
    private int length = 4;
    /**
     * 过期时间
     */
    private int expireIn = 60;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getExpireIn() {
        return expireIn;
    }

    public void setExpireIn(int expireIn) {
        this.expireIn = expireIn;
    }
}