package org.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(4);
        al.add(5);
        al.add(0,0);

        System.out.println("Elements in the al: "+al);

        //creating instance of the ArrayList of strings using generics
        ArrayList<String > al1 = new ArrayList<>();
        al1.add("Srinu");
        al1.add("Mani");
        al1.add("siva");
        al1.add("Santhu");

        System.out.println("Elements in the al1: "+al1);

        //print the size of the arrayList
        System.out.println("Print the size of the ArrayList: " +al1.size());


        //removing all elements from the arrayList
        al.clear();
        System.out.println("elements of al: " +al);

        //updating the elements in any index
        al1.set(0,"Pandu");
        System.out.println("After update the 0th index: "+al1);

        //print the index of element
        System.out.println("Index of Pandu: "+al1.indexOf("Pandu"));



    }

    public static class SumAndAverage {
        public static void main(String[] args) {

            List<Integer> numbers = Arrays.asList(4,5,0,9,8,10);

            int sum = 0;

            for(int num :numbers){
                sum = sum +num;
            }

            double average = sum/numbers.size();

            System.out.println("Sum of the given list is: " +sum);
            System.out.println("Average of the given list is: " +average);

        }
    }
}
