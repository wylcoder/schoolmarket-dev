//package com.sxdelta.schoolmarket.portal.config;
//
//import com.sxdelta.schoolmarket.portal.service.UserBasicService;
//import com.sxdelta.schoolmarket.security.config.SecurityConfig;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
//
///**
// * mall-security模块相关配置
// * Created by macro on 2019/11/5.
// */
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class MallSecurityConfig extends SecurityConfig {
//
//    @Autowired
//    private UserBasicService userBasicService;
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        //获取登录用户信息
////        return username -> userBasicService.loadUserByUsername(username);
//        return null;
//    }
//}
