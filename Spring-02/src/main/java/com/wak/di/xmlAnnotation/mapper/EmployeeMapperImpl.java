package com.wak.di.xmlAnnotation.mapper;

import org.springframework.stereotype.Repository;

/**
 * @author wak
 */
@Repository
public class EmployeeMapperImpl implements EmployeeMapper {
    @Override
    public void save() {
        System.out.println("保存员工信息");
    }
}
