package com.wak.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author wak
 */
@Configuration
@ComponentScan(basePackages = {"com.wak.mapper", "com.wak.service"})
@EnableTransactionManagement
@PropertySource(value = {"classpath:db.properties"})
@Import({JdbcConfig.class, MyBatisConfig.class})
public class SpringConfig {
}
