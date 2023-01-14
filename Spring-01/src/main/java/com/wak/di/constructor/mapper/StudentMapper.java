package com.wak.di.constructor.mapper;

import com.wak.di.constructor.domain.Student;

/**
 * @author wak
 */
public interface StudentMapper {
    void insert(Student student);
    int delete(Long id);
}
