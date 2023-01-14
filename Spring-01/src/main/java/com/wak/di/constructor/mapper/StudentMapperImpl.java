package com.wak.di.constructor.mapper;

import com.wak.di.constructor.domain.Student;

/**
 * @author wak
 */
    public class StudentMapperImpl implements StudentMapper {
        @Override
        public void insert(Student student) {
            System.out.println("保存学生信息");
        }

        @Override
        public int delete(Long id) {
            System.out.println("删除id=" + id + "的学生信息");
            return 0;
        }
    }
