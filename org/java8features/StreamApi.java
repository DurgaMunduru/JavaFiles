package org.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


//  Stream doesn't store values like collections, it simply conveys elements form a source such as data source , array,
//   collection through pipeline of computation operations
//      it has intermediate and terminal operations . terminal operations is mandatory
//      Stream is lazy and evaluates code only when required.


public class StreamApi {
    public static void main(String[] args) {
        List<Integer> numbers =    new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        //  1.forEach method
        //numbers.stream()
         //       .forEach(e -> System.out.println(e));

        //  2.filter
//        numbers.stream()
//                .filter(e->e%2==0)
//                .forEach(e -> System.out.println(e));

        //`3.map
//        numbers.stream()
//                .map(e->e*e)
//                .forEach(e -> System.out.println(e));
//
//        numbers.stream()
//                .flatMap(e -> Stream.of(e*2,e*3,e*4))
//                .forEach(e -> System.out.println(e));

        //  4.reduce
//        System.out.println(
//        numbers.stream()
//                .reduce(0,(e,carry)->e+carry));
//                                1   0       1
        //                        2   1       3
        //                        3   3       6
        //                        4   6      10

        // 5 combining filter,map,reduce

        System.out.println(
                numbers.stream()
                        .filter(e ->e%2 ==0)
                        .map(e->e*e)
                        .reduce(1,(e,carry)->e*carry)
        );

        // 6

    }
}
