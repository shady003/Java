package com.ok.test1.threading;

public class alphabets extends Thread {
    @Override
    public void run() {
        char[] alp = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (char a : alp)
        {
            System.out.print(a);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
