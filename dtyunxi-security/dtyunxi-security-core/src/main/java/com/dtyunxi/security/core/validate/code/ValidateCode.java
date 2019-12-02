/**
 * Copyright (C), 2016-2019, 云徙科技
 * FileName: ValidateCode
 * Author:   Administrator
 * Date:     2019/12/1 11:04
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dtyunxi.security.core.validate.code;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

/**
 *
 * 〈〉
 *
 * @author Administrator
 * @create 2019/12/1
 * @since 1.0.0
 */
public class ValidateCode {

    private String code;
    private LocalDateTime expireTime;

    public ValidateCode(String code, int expireSecond) {
        this.code = code;
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

    public LocalDateTime getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(LocalDateTime expireTime) {
        this.expireTime = expireTime;
    }

}