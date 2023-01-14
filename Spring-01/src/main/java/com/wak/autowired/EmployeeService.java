package com.wak.autowired;

/**
 * @author wak
 */
public class EmployeeService implements com.wak.di.setter.service.EmployeeService {

    private EmployeeMapperImpl empMapper;

    @Override
    public int delete(Long id) {
        return empMapper.delete(id);
    }

//    public void setEmpMapper(EmployeeMapperImpl empMapper) {
//        this.empMapper = empMapper;
//        System.out.println("Set注入EmployeeMapper");
//    }


}
