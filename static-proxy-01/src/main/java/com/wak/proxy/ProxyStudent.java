package com.wak.proxy;

import com.wak.domain.Student;
import com.wak.service.StudentService;
import com.wak.service.impl.StudentServiceImpl;
import com.wak.transaction.DaoTransaction;

/**
 * @author wak
 */
public class ProxyStudent implements StudentService {

    //目标对象
    private StudentServiceImpl studentService;
    //需要做的增强对象
    private DaoTransaction transaction;

    //通过构造器获取构造类和增强类对象
    public ProxyStudent(StudentServiceImpl studentService, DaoTransaction transaction) {
        this.studentService = studentService;
        this.transaction = transaction;
    }

    public void save() {
        transaction.before();
        studentService.save();
        transaction.after();
    }

    public Student query(Long id) {
        System.out.println("查询操作");
        return studentService.query(id);
    }
}
