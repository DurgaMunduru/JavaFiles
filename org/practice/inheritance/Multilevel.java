package org.practice.inheritance;

//  => Multilevel Inheritance :
//                              class 1
//                                 ||
//                              class 2
//                                 ||
//                              class 3
//          like grand child acquires the properties of grand parents


class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
class  BabyDog extends Dog{
    void weep(){
        System.out.println("weeping");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        BabyDog b = new BabyDog();

        b.weep();
        b.bark();
        b.eat();
    }
}
