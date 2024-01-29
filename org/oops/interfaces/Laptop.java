package org.oops.interfaces;

public interface Laptop {
    public  void copy();
    public  void paste();
    public void cut();
    public void keyboard();

    //another logic that required is security
    default void security(){
        System.out.println("Please implement");
    }

    //by using static, this method is needed but not requried implement in class
    static void audio(){
        System.out.println("Laptop audio ");
    }
}
