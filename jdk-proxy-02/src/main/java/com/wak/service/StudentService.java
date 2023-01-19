package com.wak.service;

import com.wak.domain.Student;

/**
 * @author wak
 */
public interface StudentService {
    /**
     * 添加学生
     */
    void save();

    /**
     * 查询学生信息
     *
     * @param id 学生id
     * @return 学生信息
     */
    Student query(Long id);
}
