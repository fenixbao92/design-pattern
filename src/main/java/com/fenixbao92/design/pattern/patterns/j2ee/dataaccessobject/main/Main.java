package com.fenixbao92.design.pattern.patterns.j2ee.dataaccessobject.main;

import com.fenixbao92.design.pattern.patterns.j2ee.dataaccessobject.Student;
import com.fenixbao92.design.pattern.patterns.j2ee.dataaccessobject.StudentDao;
import com.fenixbao92.design.pattern.patterns.j2ee.dataaccessobject.StudentDaoImpl;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        //输出所有的学生
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    +student.getRollNo()+", Name : "+student.getName()+" ]");
        }


        //更新学生
        Student student =studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        //获取学生
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : "
                +student.getRollNo()+", Name : "+student.getName()+" ]");
    }

}
