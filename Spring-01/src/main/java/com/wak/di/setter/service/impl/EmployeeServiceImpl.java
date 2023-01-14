package com.wak.di.setter.service.impl;

import com.wak.di.setter.domain.Employee;
import com.wak.di.setter.mapper.EmployeeMapper;
import com.wak.di.setter.mapper.UserMapper;
import com.wak.di.setter.mapper.UserMapperImpl;
import com.wak.di.setter.service.EmployeeService;

/**
 * @author wak
 */
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeMapper empMapper;

    private UserMapper userMapper;

    private String name;

    private int age;

    @Override
    public int delete(Long id) {
        empMapper.delete(id);
        userMapper.delete(id);
        System.out.println(name + ":" + age);
        return 0;
    }

    public void setEmpMapper(EmployeeMapper empMapper) {
        this.empMapper = empMapper;
        System.out.println("Set注入EmployeeMapper");
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
        System.out.println("Set注入UserMapper");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
