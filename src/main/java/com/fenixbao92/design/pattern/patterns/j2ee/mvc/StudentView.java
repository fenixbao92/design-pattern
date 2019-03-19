package com.fenixbao92.design.pattern.patterns.j2ee.mvc;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
