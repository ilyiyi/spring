package com.wak.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author wak
 */
@Configuration
@ComponentScan(basePackages = {"com.wak"})
@Import({DruidConfig.class})
public class SpringConfig {
}
