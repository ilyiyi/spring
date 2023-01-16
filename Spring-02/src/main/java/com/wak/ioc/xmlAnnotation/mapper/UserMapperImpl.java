package com.wak.ioc.xmlAnnotation.mapper;

import org.springframework.stereotype.Repository;

/**
 * @author wak
 */
//@Component("u")
@Repository("u")
public class UserMapperImpl implements UserMapper {
    @Override
    public void save() {
        System.out.println("保存用户成功");
    }
}
