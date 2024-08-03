package com.collectionframe;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class ExampleOnMap {
    public static void main(String[] args) {
        // HashMap<Integer,Student> hashMap = new HashMap<>();
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
        // LinkedHashMap<Integer,Student> hashMap = new LinkedHashMap<>();// based on the oeder not allow duplicates
        TreeMap<Integer, Student> hashMap = new TreeMap<>();// sorting array
        hashMap.put(131, student1);
        hashMap.put(1312, student2);
        hashMap.put(131, student3);
        System.out.println(hashMap);
        System.out.println(hashMap.get(131));

    }
}
