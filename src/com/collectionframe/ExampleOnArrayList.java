package com.collectionframe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public interface ExampleOnArrayList {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();// based on array
        LinkedList<Student> arrayList1 = new LinkedList<>();// process differnt but op same  based on a double linked list
        Student student1;
        student1 = new Student();
        student1.setSid(131);
        student1.setsName("bharath");
        student1.setsBranch("ece a");


        Student student2;
        student2 = new Student();
        student2.setSid(1312);
        student2.setsName("manohar");
        student2.setsBranch("ece b");

        Student student3;
        student3 = new Student();
        student3.setSid(131);
        student3.setsName("bharath");
        student3.setsBranch("ece a");


        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);

        System.out.println(arrayList.size());


        System.out.println(arrayList);
        Student student = arrayList.get(0);
        System.out.println(student);
        // call method

        StudentService studentService = new StudentService();

        for (Student student4 : arrayList) {
            //System.out.println(student4);

            studentService.display(student);

        }


    }
}
