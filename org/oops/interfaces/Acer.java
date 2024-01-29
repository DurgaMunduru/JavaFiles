package org.oops.interfaces;

public class Acer implements Laptop{

    public void copy() {
       System.out.println("Acer laptop copy");
    }

    @Override
    public void paste() {
        System.out.println("Acer laptop Paste");
    }

    @Override
    public void cut() {
        System.out.println("Acer laptop cut");
    }

    @Override
    public void keyboard() {
        System.out.println("Acer laptop keyboard");
    }
}
