package org.practice;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        int arr[] = new int[5];
       Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i]= scanner.nextInt();
//        }
//
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }




        String str[] = new String[5];

        //System.out.println("Enter the values of string array:");
//        for (int i = 0; i <str.length ; i++) {
//            str[i] = scanner.next();
//        }
//
//        for (int i = 0; i <str.length ; i++) {
//            System.out.print(str[i]+ " ");
//        }


        //Multidimensational array

        int arr[][] = new int[3][2];
        System.out.println("Enter the values of Array:");

        for(int row = 0; row < arr.length; row++){
            for(int col =0 ; col< arr[row].length; col++){
                arr[row][col] = scanner.nextInt();
            }
        }

        for(int row = 0; row < arr.length; row++){
            for(int col =0 ; col< arr[row].length; col++){
                System.out.print(arr[row][col]+' ');
            }
        }





    }
}
