package com.wak.di.setter.mapper;

/**
 * @author wak
 */
public class EmployeeMapperImpl implements EmployeeMapper {
    @Override
    public int delete(Long id) {
        System.out.println("删除的员工id：" + id);
        return 0;
    }
}
