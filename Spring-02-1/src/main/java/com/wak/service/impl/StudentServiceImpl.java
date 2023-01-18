package com.wak.service.impl;

import com.wak.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wak
 */
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentService studentService;

    public void save() {
        studentService.save();
    }
}
