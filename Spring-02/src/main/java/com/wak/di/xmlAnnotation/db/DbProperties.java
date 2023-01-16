package com.wak.di.xmlAnnotation.db;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author wak
 */
@Component
public class DbProperties {

    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;

    public void print() {
        System.out.println(username + " " + password);
    }
}
