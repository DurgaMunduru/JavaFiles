package org.collections.list;
import java.util.*;
import java.util.Vector;

// vector is a class which implements List interface
//  -it will increase the size by 100%
//      ex. 1st box size 10
//  if the box full then it will increase 20

public class VectorPractice {
    public static void main(String[] args) {

        Vector v1 = new Vector();

        //  => adding elements
        v1.add("Sai");
        v1.add("Jeevan");
        v1.add(0,"Raju");
        v1.add(1,"Ramesh");
        v1.add("Giri");
        v1.add("Rohini");
        v1.add("Pandu");
        v1.add("Mohini");
        v1.add("keerthi");
        v1.add("Ramu");
        v1.add("Y1");

        //print all elements
        //System.out.println("Elements in V1: " +v1);

        //print the size
        //System.out.println("Size:"+v1.size());

        //print the total capacity
        //System.out.println("Capacity:"+v1.capacity());

        //creating vector obj 2
        Vector v2 = new Vector();

        v2.add("Sneha");
        v2.add("Pavan Raj");

        //System.out.println("Elements in v2: " +v2);

        //  => adding v2 elements with v1 elements

       // v1.addAll(0,v2);
        //System.out.println("Elements after adding v2 with v1: "+v1);

        //  => remove one vector elements from one vector
       //v1.removeAll(v2);
       //System.out.println("after removing v2 from v1: "+v1);

        //  => remove all elements in vector
        //v2.clear();
        //System.out.println("after removing all the elements in v2:" +v2);

        //  => update elements in any index
       // v1.set(0,"Satish");

        //System.out.println("After updating the index 0: " +v1.get(0));
        //System.out.println("After updating the values of v1: "+v1);

        //print the index of particular element
        //System.out.println("Index of Satish: "+v1.indexOf("Satish") );

        //print the last element
        //System.out.println("First element: "+v1.firstElement());

        //print the last element
        //System.out.println("Last element: "+v1.lastElement());


        //  => Convert vector into Array
        Object [] arr = v1.toArray();
        System.out.println("Array elements: "+Arrays.toString(arr));





    }
}
