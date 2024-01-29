package org.pojojavabean;

public class Employee {

    private int id;
    public String name;
    private double salary;



    public void setId(int id){
        this.id=id;
    }
    public  int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //this is a simple POJO class which satisfies all the rules
}
