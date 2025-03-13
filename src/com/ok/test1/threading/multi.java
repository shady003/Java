package com.ok.test1.threading;
import java.lang.Thread;
public class multi {
public static void main(String[] argv){
    long timeStamp = System.currentTimeMillis();
    alphabets t1 = new alphabets();
    counter c = new counter();
    Thread t2 = new Thread(c);
        //NEW
    t1.start();
    t2.start();
    try{
        t1.sleep(100);
        Thread.currentThread().sleep(1000); //main slept for 10 sec.
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    System.out.println("\n"+ t1.getState()); //RUNNABLE
    try{
        t1.join();
        t2.join();
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }{

    }

    System.out.println("\ntime taken : "+ (System.currentTimeMillis()-timeStamp));
    System.out.println(Thread.currentThread().getName()); //TERMINATED
}
}
