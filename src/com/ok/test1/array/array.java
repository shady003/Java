package com.ok.test1.array;

import com.ok.test1.condition.Car;

public class array {

    public static void main(String[] argv){
        Car xuv = new Car(1,"White");
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 1;
        for (int i : arr){
            System.out.print(i+", ");
        }
        xuv.run();
    }

}
