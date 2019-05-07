package com.xjy.SpringBootDemo.Service;

import com.xjy.SpringBootDemo.Dao.StudentDao;


public class StudentService {
    private StudentDao studentDao;

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
