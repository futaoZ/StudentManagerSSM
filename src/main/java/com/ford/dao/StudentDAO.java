package com.ford.dao;
import com.ford.entity.Student;

import java.util.List;


/**
 * @author: Ford.Zhang
 * @version: 1.0
 * 2019/8/30 上午 11:51
 **/
public interface StudentDAO {
    int getTotal();
    void addStudent(Student student);
    void deleteStudent(int id);
    void updateStudent(Student student);
    Student getStudent(int id);
    List<Student> list(int start, int count);
}
