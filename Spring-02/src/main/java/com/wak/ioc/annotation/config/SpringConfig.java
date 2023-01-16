package com.wak.ioc.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wak
 */
@Configuration
@ComponentScan({"com.wak.ioc.annotation.mapper"})
public class SpringConfig {

}
