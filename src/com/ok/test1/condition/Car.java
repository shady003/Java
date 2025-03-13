package com.ok.test1.condition;

public class Car {
    private int count ;
    private String color ;
    public Car(int count, String color){
        this.count = count;
        this.color = color;
    }
    public void run(){
        System.out.println("Car with color :" + color + " is running...");
    }
}
