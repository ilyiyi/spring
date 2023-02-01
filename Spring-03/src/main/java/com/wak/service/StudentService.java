package com.wak.service;

import com.wak.domain.Student;

/**
 * @author wak
 */
public interface StudentService {
    void save(Student student);

    int update(Student student);

    Student queryStudentById(Long id);
}
