package org.practice;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of which multiplication table you want:");
        number = scanner.nextInt();
        System.out.println("Enter the number to which you want your table:");
        n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(number+"*"+i+"="+number*i);
        }
    }
}
