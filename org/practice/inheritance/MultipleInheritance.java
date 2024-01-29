package org.practice.inheritance;

interface Car{
    int speed = 60;

    public void distanceTravelled();
}

interface Bus{
    int distance = 100;
    public  void speed();
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Vehical v = new Vehical();
        v.distanceTravelled();
        v.speed();
    }
}
