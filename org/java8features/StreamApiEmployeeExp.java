package org.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    private int id;
    private String firstname;
    private String lastname;
    private  String department;
    private String jobtitle;
    private double salary;

    private  int age;

    public Employee(int id, String firstname, String lastname, String department, String jobtitle, double salary, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
        this.jobtitle = jobtitle;
        this.salary = salary;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", department='" + department + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}

public class StreamApiEmployeeExp {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(101,"Durga","Munduru","DEX","Java Developer",70000.00,24));
        employeeList.add(new Employee(102,"Depika","Sethan","DEX","Frontend Developer",140000.00,24));
        employeeList.add(new Employee(103,"John","Paul","REX","Backend Developer",90000.00,25));
        employeeList.add(new Employee(104,"Murthy","Gsn","REX","FullStack Developer",200000.00,24));
        employeeList.add(new Employee(105,"Swathi","Gsn","FEX","Java Developer",100000.00,24));

        //  1.print all the employees
//        employeeList.stream()
//                .forEach(e->System.out.println(e));

        //  2.employees paid more than 100k
//        employeeList.stream()
//                .filter(employee -> employee.getSalary()>100000.00)
//                .forEach(e->System.out.println(e));

        //  3.sort by firstname
//        employeeList.stream()
//                .sorted((e1,e2)->e1.getFirstname().compareTo(e2.getFirstname()))
//                .forEach(e->System.out.println(e));

        //  4.Only firstname in sorted order
//        employeeList.stream()
//                .map(e->e.getFirstname())
//                .distinct()
//                .sorted()
//                .forEach(e->System.out.println(e));

        //  5.count of employee in DEX department
       System.out.println(
        employeeList.stream()
                .filter(e->e.getDepartment().equals("REX"))
                .count()
       );


       //   6.sum of salaries of all employees in 'DEX' dept
//        System.out.println(
//        employeeList.stream()
//                .filter(e->e.getDepartment().equals("DEX"))
//                .mapToDouble(e->e.getSalary())
//                .sum()
//        );

        Map<String,Double>empmap= employeeList.stream()
                .collect(Collectors.toMap(
                        e->e.getFirstname(),e->e.getSalary()
                ));
        System.out.println(empmap);




    }
}
