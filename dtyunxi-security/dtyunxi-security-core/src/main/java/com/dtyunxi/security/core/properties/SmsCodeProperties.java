/**
 * Copyright (C), 2016-2019, 云徙科技
 * FileName: SmsCodeProperties
 * Author:   Administrator
 * Date:     2019/12/1 16:21
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
 * @create 2019/12/1
 * @since 1.0.0
 */
public class SmsCodeProperties {
    /**
     * 验证码长度
     */
    private int length = 4;
    /**
     * 过期时间
     */
    private int expireIn = 60;

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