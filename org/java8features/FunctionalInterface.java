package org.java8features;


//  => Function Interface: that contains only one abstract method is called Functional interface and is also known as
//      Single Abstract Method(SAM).
//     - It can have any number of default,static methods
//     - We have to add @FunctionalInterface to the top of the interface
//          - it means in the functionalInterface only one method is to be declared
//     - if we want to add more than one method we have make it default then it is possible

//     - Functional Interface can have methods of Object class.
//          -Object class is present in java.lang package
//          - Every class in java is directly or indirectly derived from the Object class. If a class doesn't extend
//            other class then it is direct child class of Object class.

@java.lang.FunctionalInterface
interface A{
    void show();



    default void put(){
        System.out.println("in put....");
    }

}

class B implements A{
    public void show(){
        System.out.println("In show...");
    }
}
public class FunctionalInterface {
    public static void main(String[] args) {

        A b = new B();
        b.show();

    }
}
