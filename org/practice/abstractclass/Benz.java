package org.practice.abstractclass;

public  class Benz implements Car{


    @Override
    public void brake() {
        System.out.println("Benz car stopped");
    }

    @Override
    public void sound() {
        System.out.println("It's Benz car sound");
    }

    @Override
    public void steering() {
        System.out.println("Benz car has nice steering to handled easily");
    }

    @Override
    public void Engine() {
        System.out.println("Benz has a world's No1 Engine");
    }

    @Override
    public void model() {
        System.out.println("BENZ_1736");
    }
}
