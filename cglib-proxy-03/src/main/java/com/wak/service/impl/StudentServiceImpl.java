package com.wak.service.impl;

import com.wak.domain.Student;
import com.wak.service.StudentService;

/**
 * @author wak
 */
public class StudentServiceImpl implements StudentService {
    public void save() {
        System.out.println("保存学生信息");
    }

    public Student query(Long id) {
        return new Student("" + id, 18);
    }
}
