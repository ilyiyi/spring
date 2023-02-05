package com.wak.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @author wak
 */
public class JdbcConfig {

    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.driver}")
    private String driverClassName;

    /**
     * 配置德鲁伊连接池
     *
     * @return 数据源
     */
    @Bean
    public DataSource dataSource() {
        DruidDataSource source = new DruidDataSource();

        source.setUsername(username);
        source.setPassword(password);
        source.setUrl(url);
        source.setDriverClassName(driverClassName);

        return source;
    }

    /**
     * 配置平台事务管理器
     *
     * @param source 数据源
     * @return 事务管理器
     */
    @Bean
    public PlatformTransactionManager transactionManager(DataSource source) {
        return new DataSourceTransactionManager(source);
    }

}
