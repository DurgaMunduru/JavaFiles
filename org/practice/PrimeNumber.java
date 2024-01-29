package org.practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        int count=0;
        for(int i = 2; i<number; i++){
            if (number% i == 0){
                count++;
                break;
            }
        }
        if (count ==0){
            System.out.println("Given "+number +" is prime number");
        }else {
            System.out.println("Given "+number +" is not a prime number");
        }

    }
}
