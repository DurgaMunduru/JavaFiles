package org.oops.interfaces;

public class Lenovo implements  Laptop{
    @Override
    public void copy() {
        System.out.println("Lenovo Laptop Copy");
    }

    @Override
    public void paste() {
        System.out.println("Lenovo Laptop paste");
    }

    @Override
    public void cut() {
        System.out.println("Lenovo Laptop cut");
    }

    @Override
    public void keyboard() {
        System.out.println("Lenovo Laptop keyboard");
    }

    public void powerpoint(){
        System.out.println("Lenovo laptop powerpoint");
    }
}
