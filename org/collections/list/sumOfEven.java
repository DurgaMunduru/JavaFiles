package org.collections.list;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class sumOfEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,2,3,5);
        int sum = 0;
        for (int num :numbers){
            if(num%2==0)
                sum=sum+num;


        }
        System.out.println("Sum of even numbers is: "+sum);
    }
}
