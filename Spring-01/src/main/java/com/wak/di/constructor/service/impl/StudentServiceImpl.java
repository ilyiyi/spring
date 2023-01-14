package com.wak.di.constructor.service.impl;

import com.wak.di.constructor.domain.Student;
import com.wak.di.constructor.mapper.StudentMapper;
import com.wak.di.constructor.service.StudentService;

/**
 * @author wak
 */
public class StudentServiceImpl implements StudentService {

    private StudentMapper mapper;

    public StudentServiceImpl(StudentMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void insert(Student student) {
        mapper.insert(student);
    }

    @Override
    public int delete(Long id) {
        return mapper.delete(id);
    }
}
