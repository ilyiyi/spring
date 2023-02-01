package com.wak.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author wak
 */
@Configuration
@ComponentScan(basePackages = {"com.wak.controller"})
@EnableWebMvc
public class SpringMvcConfig {
}
