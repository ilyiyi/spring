package com.wak.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author wak
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.wak"})
public class AOPConfig {
}
