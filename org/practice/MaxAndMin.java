package org.practice;

import javax.swing.text.html.StyleSheet;
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        System.out.println("enter the three numbers:");
        Scanner scanner = new Scanner(System.in);
        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();
        thirdNumber = scanner.nextInt();

        System.out.println(largest(firstNumber,secondNumber,thirdNumber));
        System.out.println(smallest(firstNumber,secondNumber,thirdNumber));

    }

    public static int largest(int firstNumber, int secondNumber, int thirdNumber){
        int max = firstNumber;
        if(max<secondNumber){
            max=secondNumber;
        }
        if (max<thirdNumber) {
            max=thirdNumber;
        }
        return max;

    }

    public static int smallest(int first,int second, int third){
        int min = first;
        if(min>second){
            min=second;
        }
        if (min>third){
            min = third;
        }
        return min;
    }

}

