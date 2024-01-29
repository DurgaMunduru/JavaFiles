package org.java8features;
/*Method reference is used to refer method of functional interface.
 It is compact and easy form of lambda expression.
 */



interface SayGreeting{
    void greet();
}
interface ChinaGreeting{
    public static void sayHello(){
        System.out.println("Nihaoo");
    }
}
interface IndianGreeting{
    public static void SayHi(){
        System.out.println("Namskar");
    }
}
public class MethodReferenceDemo {
    public MethodReferenceDemo() {
        System.out.println("This is constructor........");
    }
    public static void greeting(){
        System.out.println("Hello !.........This is static reference method");
    }
    public void print() {
        System.out.println("Hi !.........This is instance reference method");
    }
    public static void main(String[] args) {
        MethodReferenceDemo.greeting();
        //Static method reference
        SayGreeting greet1 = MethodReferenceDemo::greeting;
        greet1.greet();
        greet1 = ChinaGreeting::sayHello;
        greet1.greet();
        greet1=IndianGreeting::SayHi;
        greet1.greet();

        //Instance method Refrence

        greet1=new MethodReferenceDemo()::print;
        greet1.greet();

        //Constructor Reference

        greet1= MethodReferenceDemo::new;
        greet1.greet();

    }
}