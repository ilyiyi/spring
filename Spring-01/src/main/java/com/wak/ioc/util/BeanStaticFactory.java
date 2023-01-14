package com.wak.ioc.util;

import com.wak.ioc.domain.Student;

/**
 * @author wak
 */
public class BeanStaticFactory {

    public static Student getBean() {
        return new Student();
    }

    public static Object getBean(String name) {
        if ("Student".equals(name)) {
            return new Student();
        } else if ("SingleObject".equals(name)) {
            return new SingleObject();
        } else {
            return new Object();
        }
    }

}
