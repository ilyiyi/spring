package com.wak.annotation.mapper;

import org.springframework.stereotype.Repository;

/**
 * @author wak
 */
@Repository
public class StudentMapperImpl implements StudentMapper {
    @Override
    public void save() {
        System.out.println("保存学生成功");
    }
}
