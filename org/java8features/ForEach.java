package org.java8features;


import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);


        // enhanced for loop
//       for (int n:nums){
//           System.out.println(n);
//       }

        //forEach loop with lambda expression
        nums.forEach(n -> System.out.println(n));

    }
}
