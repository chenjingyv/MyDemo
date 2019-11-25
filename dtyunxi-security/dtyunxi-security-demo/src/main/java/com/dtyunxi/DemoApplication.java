/**
 * Copyright (C), 2016-2019, 云徙科技
 * FileName: DemoApplication
 * Author:   Administrator
 * Date:     2019/11/24 12:04
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dtyunxi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 〈〉
 *
 * @author Administrator
 * @create 2019/11/24
 * @since 1.0.0
 */

@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }
    @GetMapping(value="/hello")
    public String hello(){
        return "hello spring security!";
    }

}