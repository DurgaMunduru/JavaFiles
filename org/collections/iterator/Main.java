package org.collections.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//  => Iterator:    An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
//                  It is called an "iterator" because "iterating" is the technical term for looping.
//                  To use an Iterator, you must import it from the java.util package.
public class Main {
    public static void main(String[] args) {

        List<String> cars = Arrays.asList("BMW","TOYOTA","BENZ","KIA");

        Iterator<String> iterator = cars.listIterator();

        //print the first number
        System.out.println(iterator.next());

        //loop the list
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
