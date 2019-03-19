package com.fenixbao92.design.pattern.patterns.j2ee.transferobject.main;

import com.fenixbao92.design.pattern.patterns.j2ee.transferobject.StudentBO;
import com.fenixbao92.design.pattern.patterns.j2ee.transferobject.StudentVO;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {

    public static void main(String[] args) {
        StudentBO studentBusinessObject = new StudentBO();

        //输出所有的学生
        for (StudentVO student : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    +student.getRollNo()+", Name : "+student.getName()+" ]");
        }

        //更新学生
        StudentVO student =studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        //获取学生
        studentBusinessObject.getStudent(0);
        System.out.println("Student: [RollNo : "
                +student.getRollNo()+", Name : "+student.getName()+" ]");
    }

}
