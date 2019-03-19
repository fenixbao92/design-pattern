package com.fenixbao92.design.pattern.patterns.j2ee.dataaccessobject;

import java.util.List;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public interface StudentDao {

    List<Student> getAllStudents();

    Student getStudent(int rollNo);

    void updateStudent(Student student);

    void deleteStudent(Student student);

}
