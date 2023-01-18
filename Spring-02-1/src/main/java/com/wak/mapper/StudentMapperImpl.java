package com.wak.mapper;

import org.springframework.stereotype.Repository;

/**
 * @author wak
 */
@Repository
public class StudentMapperImpl implements StudentMapper {
    public void save() {
        System.out.println("保存操作");
    }
}
