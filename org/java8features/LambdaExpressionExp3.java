package org.java8features;

import java.util.Scanner;

interface Square{
    int calculateSquare(int x);
}

public class LambdaExpressionExp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

    Square square = (int x) ->( x*x);
    System.out.println("square of given number is:"+square.calculateSquare(sc.nextInt()));
    }
}
