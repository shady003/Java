package com.ok.test1.array;

public class recursion {
    private static int factorial(int n){
            if (n==0) return 1 ;
            else return n * factorial(n-1);
    }

    public static void main(String[] args) {
            int i = 5 ;
        System.out.println(factorial(i));
    }
}
