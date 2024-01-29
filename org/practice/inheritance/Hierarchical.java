package org.practice.inheritance;

//  => Hierarchical inheritance:
//                                  class 1
//                              ||            ||
//                          class 2         class 3

class Animals{
    void eat(){
        System.out.println("eating");
    }
}
class Dogs extends Animals{
    void SoundOfDogs(){
        System.out.println("barking");
    }
}
class Cats extends Dogs{
    void SoundOfCats(){
        System.out.println("meowing");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        Cats c = new Cats();

        c.SoundOfCats();
        c.SoundOfDogs();
        c.eat();
    }
}
