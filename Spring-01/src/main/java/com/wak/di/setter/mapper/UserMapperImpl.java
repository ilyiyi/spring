package com.wak.di.setter.mapper;

/**
 * @author wak
 */
public class UserMapperImpl implements UserMapper {
    @Override
    public int delete(Long id) {
        System.out.println("删除的用户id：" + id);
        return 0;
    }
}
