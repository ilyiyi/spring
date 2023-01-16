package com.wak.di.xmlAnnotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author wak
 */
@Configuration
@ComponentScan(basePackages = {"com.wak.di.xmlAnnotation"})
@PropertySource({"db.properties"})
public class DiConfig {
}
