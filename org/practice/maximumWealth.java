package org.practice;

public class maximumWealth {
    public static void main(String[] args) {
        int [][] accounts = {{1,2,3},{2,3,4,5},{1,2,3}};
        System.out.println(maxWealth(accounts));
    }
    public static int maxWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int[] person: accounts){
            int sum = 0;
            for (int account: person){
                sum = sum+ account;
            }
            if (sum>ans){
                ans = sum;
            }
        }
        return ans;
    }

}
