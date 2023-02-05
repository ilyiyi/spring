package com.wak.config;

import com.wak.interceptor.AuthInterceptor;
import com.wak.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wak
 */
@Configuration
@ComponentScan(basePackages = {"com.wak.controller", "com.wak.config", "com.wak.exception", "com.wak.interceptor"})
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor interceptor;

    @Autowired
    private AuthInterceptor interceptor1;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor).addPathPatterns("/item");
        registry.addInterceptor(interceptor1).addPathPatterns("/item");
    }
}
