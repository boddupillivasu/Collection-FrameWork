package com.collectionframe;

import java.util.Objects;

public class Student implements Comparable {
    /* java beans class comntains only privte data and also no argument constructor

     */
    // instance variables with private access
    private int sid;
    private String sName;
    private String sBranch;

    public Student() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsBranch() {
        return sBranch;
    }

    public void setsBranch(String sBranch) {
        this.sBranch = sBranch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sid == student.sid && Objects.equals(sName, student.sName) && Objects.equals(sBranch, student.sBranch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, sName, sBranch);
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sName='" + sName + '\'' +
                ", sBranch='" + sBranch + '\'' +
                '}';

    }

    @Override
    public int compareTo(Object o) {
        return this.sName.compareTo(o.toString());
    }
}
