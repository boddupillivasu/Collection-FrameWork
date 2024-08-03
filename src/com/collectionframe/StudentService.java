package com.collectionframe;

public class StudentService {


    public void display(Student student) {
        System.out.println("sid:" + student.getSid());
        System.out.println("sname:" + student.getsName());
        System.out.println("sbranch:" + student.getsBranch());
    }
}
