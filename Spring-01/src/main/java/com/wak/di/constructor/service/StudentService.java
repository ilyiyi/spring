package com.wak.di.constructor.service;

import com.wak.di.constructor.domain.Student;

/**
 * @author wak
 */
public interface StudentService {
    void insert(Student student);
    int delete(Long id);
}
