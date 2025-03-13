package com.ok.test1.oop;

public class Inheritance {
    class Animal{
    void eat (){
        System.out.println("Animal is eating ...");
    }
    }
    class Dog extends Animal{
        void bark (){
            System.out.println("barking");
        }

    }

}
