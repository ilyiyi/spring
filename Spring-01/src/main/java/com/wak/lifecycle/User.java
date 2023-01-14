package com.wak.lifecycle;

import lombok.ToString;

/**
 * @author wak
 */
@ToString
public class User {

    private String name;

    public User() {
        System.out.println("User构造器执行");
    }

    public void setName(String name) {
        System.out.println("调用name的set方法");
        this.name = name;
    }

    public void init() {
        System.out.println("调用init");
    }

    public void destroy() {
        System.out.println("调用destroy");
    }


}
