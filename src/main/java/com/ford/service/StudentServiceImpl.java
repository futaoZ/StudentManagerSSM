package com.ford.service;

import com.ford.dao.StudentDAO;
import com.ford.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author: Ford.Zhang
 * @version: 1.0
 * 2019/8/30 下午 12:03
 **/
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDAO studentDAO;

    public int getTotal() {
        return studentDAO.getTotal();
    }

    public void addStudent(Student student) {
        studentDAO.addStudent(student);
    }

    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }

    public void updateStudent(Student student) {
        studentDAO.updateStudent(student);
    }

    public Student getStudent(int id) {
        return studentDAO.getStudent(id);
    }

    public List<Student> list(int start, int count) {
        return studentDAO.list(start, count);
    }
}
