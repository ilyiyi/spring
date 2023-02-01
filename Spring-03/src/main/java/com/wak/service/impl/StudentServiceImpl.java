package com.wak.service.impl;

import com.wak.domain.Student;
import com.wak.service.StudentService;
import org.springframework.stereotype.Component;

/**
 * @author wak
 */
@Component
public class StudentServiceImpl implements StudentService {
    @Override
    public void save(Student student) {
        System.out.println("保存操作");
//        System.out.println(1 / 0);
    }

    @Override
    public int update(Student student) {
        System.out.println("更新操作");
        return 0;
    }

    @Override
    public Student queryStudentById(Long id) {
        System.out.println("查询操作");
        return null;
    }
}
