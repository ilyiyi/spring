package com.wak.di.xmlAnnotation.service.impl;

import com.wak.di.xmlAnnotation.mapper.EmployeeMapper;
import com.wak.di.xmlAnnotation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wak
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;


    @Override
    public void save() {
        employeeMapper.save();
    }
}
