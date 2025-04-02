package com.ok.test1.array;

public class reverse {
    private static void rev(int [] arr , int i , int j){
        while (i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

    }
}
