package org.oops.abstraction;

public class AbstractionExample {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Fluffy");

        myCat.makeSound();
        myDog.makeSound();
    }
}

//explanation :
//          Animal abstract class with an abstract method makeSound(). the Dog and Cat classes extends Animal and
//          implement makeSound() method.
//      this demonstrates the abstraction , where we define a template for a class (in animal) but leaves the
//      but leaves the implementation of certain methods to be defined by subclasses