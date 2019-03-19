package com.fenixbao92.design.pattern.patterns.j2ee.mvc.main;

import com.fenixbao92.design.pattern.patterns.j2ee.mvc.Student;
import com.fenixbao92.design.pattern.patterns.j2ee.mvc.StudentController;
import com.fenixbao92.design.pattern.patterns.j2ee.mvc.StudentView;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {
    public static void main(String[] args) {

        //从数据库获取学生记录
        Student model  = retriveStudentFromDatabase();

        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //更新模型数据
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}