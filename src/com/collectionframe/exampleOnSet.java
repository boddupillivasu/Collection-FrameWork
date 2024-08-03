package com.collectionframe;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class exampleOnSet {
    public static void main(String[] args) {
        /*
        collection is a framework and it is a object and it is group of  objects
        its provide predefined data structures and algorithms

        colllection frame work are classifiexd in three types
        1. set(hash setm, lineked hash set,treeset)

        hashset:do not allow duplicates and unordewr format
        linked hashset:do not allow duplicatesn and oreder format
        treee set: sorted formmate means alphabetical order
         */
// object creation
        Student student;
        student = new Student();

        // setter method
        student.setSid(13);
        student.setsName("vasu");
        student.setsBranch("ece");
//        System.out.println(student);// it represents or display hash code and create too string method
//        System.out.println("the name is:"+student.getsName());// by getter method

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

        System.out.println("--- treeset ---");
        TreeSet<Student> set = new TreeSet<>();
        set.add(student1);
        set.add(student);
        set.add(student3);
        set.add(student2);
        System.out.println(set.size());
        System.out.println(set);

        //foreach loop
        for (Student student4 : set) {
            System.out.println(student4);
        }

        //service layer object
        StudentService studentService;
        studentService = new StudentService();

        System.out.println("--- hashset ---");
        HashSet<StudentService> studentServices = new HashSet<>();
        studentService.display(student);
        studentService.display(student1);
        studentService.display(student2);
        studentService.display(student3);
        for (StudentService studentService1 : studentServices) {
            System.out.println(studentService1);
        }
        System.out.println("---liked hashset---");
        LinkedHashSet<StudentService> studentServices1 = new LinkedHashSet<>();
        studentService.display(student);
        studentService.display(student1);
        studentService.display(student2);
        studentService.display(student3);
        for (StudentService studentService1 : studentServices1) {
            System.out.println(studentService1);
        }


//      HashSet<String>  set = new HashSet<>();//un order
//      LinkedHashSet<String>  set = new LinkedHashSet<>();//order way
//        TreeSet<String> set = new TreeSet<>();//sorted way
//        set.add("hello");
//        set.add("hello");
//        // these are primitives and jenaric are String type
////        set.add(123);
////        set.add(1132.23);
////        set.add(1132.23);
//        set.add("yqdg");
//        set.add("A");
//        System.out.println("the size is:" + set.size());
//        System.out.println(set);// it displays un order way  as a list[]
//
//
////        Iterator iterator = hashSet.iterator(); // iterator method  it doest use in rescent days
////        while (iterator.hasNext()) {// it locates true or false
////            System.out.println(iterator.next()); //it prints next stament
////        }
//
//        for (String s :set){// is  not accecepted for primitives
//            System.out.println(s);
//        }

    }
}

