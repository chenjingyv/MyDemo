/**
 * Copyright (C), 2016-2019, 云徙科技
 * FileName: MyUserDetailService
 * Author:   Administrator
 * Date:     2019/11/24 15:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dtyunxi.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * 〈〉
 *
 * @author Administrator
 * @create 2019/11/24
 * @since 1.0.0
 */
@Service
public class MyUserDetailsService implements UserDetailsService{

    private Logger log = LoggerFactory.getLogger(MyUserDetailsService.class);

    private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        log.info(userName);
        String password = this.bCryptPasswordEncoder.encode("123456");
        log.info(password);
        if(this.bCryptPasswordEncoder.matches("123456",password)){
            return new User(userName,password, AuthorityUtils.createAuthorityList("admin"));
        }
        throw new BadCredentialsException("用户名或密码错误");
    }
}