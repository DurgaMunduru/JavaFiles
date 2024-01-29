package org.practice;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        int numOne;
        int numTwo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        numOne = scanner.nextInt();
        System.out.println("Enter the second number:");
        numTwo = scanner.nextInt();
        int hcf;
        if ( numOne< numTwo){
            hcf = numOne;
        }else {
            hcf= numTwo;
        }

        while(true){
            if((numOne%hcf == 0) && (numTwo%hcf == 0)){
                break;
            }
            else {
                hcf--;
            }
        }
        System.out.println("HCF of "+numOne +", " +numTwo +"is: " +hcf);

    }
}
