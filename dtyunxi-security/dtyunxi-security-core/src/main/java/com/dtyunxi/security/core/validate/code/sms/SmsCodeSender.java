/**
 * Copyright (C), 2016-2019, 云徙科技
 * FileName: SmsSender
 * Author:   Administrator
 * Date:     2019/12/1 11:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dtyunxi.security.core.validate.code.sms;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/12/1
 * @since 1.0.0
 */
public interface SmsCodeSender {
    void send(String mobile,String code);
}