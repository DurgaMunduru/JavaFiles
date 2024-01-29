package org.practice;

public class EvenDigitsOrNot {
    public static void main(String[] args) {
        int nums[] = {12, 3, 56, 7, 8,5678, 98, 1234};
        int count = 0;
        System.out.println(findNumbers(nums));


    }


    static int findNumbers(int[] nums){
        int count=0;
        for (int num:nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    private static int digits(int num) {
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }


}