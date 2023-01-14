package com.wak.ioc.util;

import com.wak.ioc.domain.Student;

/**
 * @author wak
 */
public class BeanFactory {
    public Object getBean() {
        return new Student();
    }
}
