package org.oops.polymorphism;

public class Calculations {

    public void add(int a , int b){
        int c = a+b;
        System.out.println("addition of two integers is : "+c);
    }

    public void add(int a , int  b, int c){
        int p = a+b+c;
        System.out.println("addition of three integers is : "+p);
    }
    public void add(double a ,double b){
        double d = a+b;
        System.out.println("addition of two double is : "+d);
    }
}
