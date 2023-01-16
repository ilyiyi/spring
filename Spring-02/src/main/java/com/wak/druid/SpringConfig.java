package com.wak.druid;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author wak
 */
@Configuration
@PropertySource({"db.properties"})
@Import({DruidConfig.class})
public class SpringConfig {
}
