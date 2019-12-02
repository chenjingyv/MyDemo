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

public class ImageCodeProperties extends SmsCodeProperties{
    private int width = 65;
    /**
     * 长度
     */
    private int height = 40;


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
}