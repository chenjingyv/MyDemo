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
package com.dtyunxi.security.core.validate.code.image;


import com.dtyunxi.security.core.validate.code.ValidateCode;

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
public class ImageCode extends ValidateCode {

    private BufferedImage image;

    public ImageCode(String code, BufferedImage image, int expireSecond) {
        super(code,expireSecond);
        this.image = image;
    }
    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
}