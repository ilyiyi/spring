package com.wak.autowired;

import com.wak.di.setter.mapper.EmployeeMapper;

/**
 * @author wak
 */
public class EmployeeMapperImpl implements EmployeeMapper {
    @Override
    public int delete(Long id) {
        System.out.println("删除的员工id：" + id);
        return 1;
    }
}
