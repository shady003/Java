package com.ok.test1.threading;

public class counter implements Runnable{
    @Override
    public void run() {
        for (int i =0 ; i <=26 ; i++)
        {
            System.out.print(i);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
