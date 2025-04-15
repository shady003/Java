package com.ok.test1.array;

public class DecimalToBinary {
    private static String ToBinary(int n){
        String binary = "";
        if (n==0){
            return "0";
        }
        else {
        while(n > 0){
            int r = n % 2;
            n = n/2;
            binary += r;
        }

        return new StringBuilder(binary).reverse().toString() ;}
    }

    public static void main(String[] args) {
        System.out.println(ToBinary(10));
    }
}
