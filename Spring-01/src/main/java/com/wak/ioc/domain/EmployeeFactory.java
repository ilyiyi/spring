package com.wak.ioc.domain;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author wak
 */
public class EmployeeFactory implements FactoryBean<Employee> {

    @Override
    public Employee getObject() throws Exception {
        System.out.println("获取Employee对象");
        return new Employee();
    }

    @Override
    public Class<?> getObjectType() {
        return Employee.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
