package com.ok.test1.array;


public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(ToDecimal(10101));
    }


    private static int ToDecimal(int n){
            int counter = 0 ;
            int res = 0 ;
        while(n!=0){
            int rem = n % 10 ;
            n /= 10;
            res += (rem * Math.pow(2,counter));
            counter++;
        }
        return res;
    }

}
