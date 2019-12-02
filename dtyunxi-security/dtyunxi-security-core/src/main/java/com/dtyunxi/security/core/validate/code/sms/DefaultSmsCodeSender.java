/**
 * Copyright (C), 2016-2019, 云徙科技
 * FileName: DeaulftSmsSender
 * Author:   Administrator
 * Date:     2019/12/1 11:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dtyunxi.security.core.validate.code.sms;

/**
 *
 * 〈〉
 *
 * @author Administrator
 * @create 2019/12/1
 * @since 1.0.0
 */
public class DefaultSmsCodeSender implements SmsCodeSender{

    @Override
    public void send(String mobile, String code) {
        System.out.println("给手机号: "+mobile+" 发送短信验证码: "+code);
    }


}