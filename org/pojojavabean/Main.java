package org.pojojavabean;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setId(101);
        emp.setName("Durga");
        emp.setSalary(30000.00);

        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());


    }
}
