package org.exceptionhandling;

import java.util.Scanner;

public class exceptionEx {
    public static void main(String[] args) {

        //creating exception
//        System.out.println("Program execution starts");
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the first number");
//        int firstNumber = sc.nextInt();
//        System.out.println("Enter the second number");
//        int secondNumber = sc.nextInt();
//        int result = firstNumber/secondNumber;
//
//        System.out.println("output is : "+result);
//        System.out.println("program execution ends");

    //  handling the exception

        System.out.println("Program execution starts");

       Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = sc.nextInt();
        int result = 0;
        try {
             result = firstNumber / secondNumber;
        }catch (ArithmeticException e){
          System.out.println(e.toString());
        }finally {
            System.out.println("finally block");
        }


        System.out.println("output is : "+result );
        System.out.println("program execution ends");



    }
}
