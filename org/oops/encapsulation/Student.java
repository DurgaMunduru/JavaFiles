package org.oops.encapsulation;

public class Student {
     private  int rollNo;
    private  String name;
    private boolean isAttend;

    public Student(int rollNo){
        this.rollNo=rollNo;
    }

    public boolean isAttend() {
        return isAttend;
    }

    public void setAttend(boolean flag) {
        if (!isAttend)
            isAttend=flag;
        System.out.println("teacher assigned attendance");
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
