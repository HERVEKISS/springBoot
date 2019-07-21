package com.herve.Dao;

import com.herve.Entity.Student;

import java.util.Collection;


public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}
