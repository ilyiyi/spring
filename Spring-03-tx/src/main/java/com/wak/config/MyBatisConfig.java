package com.wak.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author wak
 */
public class MyBatisConfig {

    /**
     * 配置SqlSessionFactoryBean
     *
     * @param source 数据源
     * @return SqlSessionFactoryBean
     */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource source) {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(source);
        return bean;
    }

    /**
     * 配置mybatis查找mapper文件的路径
     *
     * @return MapperScannerConfigurer
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setBasePackage("com.wak.mapper");
        return configurer;
    }
}
