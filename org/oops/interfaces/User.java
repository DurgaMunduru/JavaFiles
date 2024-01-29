package org.oops.interfaces;

public class User {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        lenovo.copy();
        lenovo.paste();
        lenovo.cut();
        lenovo.keyboard();
        lenovo.powerpoint();
        Laptop.audio();

        Acer acer = new Acer();
        acer.copy();
        acer.cut();
        acer.paste();
        acer.keyboard();

    }
}
