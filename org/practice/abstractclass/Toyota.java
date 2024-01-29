package org.practice.abstractclass;

public abstract class Toyota implements Car{

    public  void brake(){
        System.out.println("Toyota stopped");
    }

    @Override
    public void Engine() {
        System.out.println("Toyota has a good Engine");
    }


    public abstract void sound() ;

    @Override
    public void steering() {
        System.out.println("Toyota has a nice steering,but not as good as Benz's");
    }


    public abstract  void model() ;
}
