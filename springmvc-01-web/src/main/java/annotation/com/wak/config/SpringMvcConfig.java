package annotation.com.wak.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wak
 */
@Configuration
@ComponentScan(basePackages = {"annotation.com.wak.controller"})
public class SpringMvcConfig {
}
