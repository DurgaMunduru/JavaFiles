package org.practice.inheritance;

public class Vehical implements Car,Bus{
    int distanceTravelled;
    int averageSpeed;

    public void distanceTravelled(){
        distanceTravelled =speed*distance;
        System.out.println("Total Distance travelled is "+distanceTravelled);
    }

    public void speed(){
        int averageSpeed = distanceTravelled/speed;
        System.out.println("Average Speed maintained is "+averageSpeed);
    }
}
