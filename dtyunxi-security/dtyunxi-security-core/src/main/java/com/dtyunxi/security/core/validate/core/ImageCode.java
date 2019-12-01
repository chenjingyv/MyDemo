/**
 * Copyright (C), 2016-2019, 云徙科技
 * FileName: ImageCode
 * Author:   Administrator
 * Date:     2019/11/30 15:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dtyunxi.security.core.validate.core;


import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

/**
 *
 * 〈〉
 *
 * @author Administrator
 * @create 2019/11/30
 * @since 1.0.0
 */
public class ImageCode {

    private String code;
    private BufferedImage image;
    private LocalDateTime expireTime;

    public ImageCode(String code, BufferedImage image, int expireSecond) {
        this.code = code;
        this.image = image;
        this.expireTime = LocalDateTime.now().plusSeconds(expireSecond);
    }

    public boolean isExpried(){
        return LocalDateTime.now().isAfter(this.expireTime);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public LocalDateTime getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(LocalDateTime expireTime) {
        this.expireTime = expireTime;
    }
}