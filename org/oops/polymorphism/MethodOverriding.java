
//  => if subclass has the same method as declared in the parent class is know as methodOverriding
//          or
//  => subclass provides the implementation of the method that has been declared in the parent class


package org.oops.polymorphism;

//Creating a parent class.
class Bank{
    int getRateOfInterest(){return 0;}
}
//Creating child classes.
class SBI extends Bank{
    int getRateOfInterest(){return 8;}
}

class ICICI extends Bank{
    int getRateOfInterest(){return 7;}
}
class AXIS extends Bank{
    int getRateOfInterest(){return 9;}
}
public class MethodOverriding {
    public static void main(String[] args) {
        SBI b = new SBI();
       System.out.println("Rate of interest of SBI is : " +b.getRateOfInterest());

        ICICI c = new ICICI();
        System.out.println("Rate of interest of ICICI is : " +c.getRateOfInterest());

        AXIS a = new AXIS();
        System.out.println("Rate of interest of AXIS is : " +a.getRateOfInterest());

    }
}
