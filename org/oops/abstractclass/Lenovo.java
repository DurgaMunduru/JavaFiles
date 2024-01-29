package org.oops.abstractclass;

import org.oops.interfaces.Laptop;

public abstract class Lenovo implements Laptop {

    //implement methods
    @Override
    public void copy() {
        System.out.println("Lenovo Laptop Copy");
    }

    @Override
    public void paste() {
        System.out.println("Lenovo Laptop paste");
    }

    //unimplemented methods, which required abstract keyword
    public abstract void cut();
    public abstract void keyboard();

    //we can implement these methods in another class which extends this class

}
