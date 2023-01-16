package com.wak.ioc.scope;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author wak
 */
@Component
public class LifeBean {

    public LifeBean() {
        System.out.println("无参构造执行");
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化bean");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁bean");
    }
}
