package org.java8features;

//  => Lambda Expression is a new java feature which was introduced in java 8
//      - It provides the implementation of functional interfaces
//      - It will reduce the code
//
//      Syntax:     () -> { //body }
//                  (parameters) -> { //body }

//  In the below example we can see Functional Interfaces with anonymous Inner class and lambda expression

@java.lang.FunctionalInterface
interface print{

    void print();

}

public class LambdaExpression {
    public static void main(String[] args) {
        print a = () -> System.out.println("In print...");
        a.print();
    }
}
