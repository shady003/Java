package com.ok.test1.threading;
class count extends Thread{
    public count(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i =0 ; i <=3 ; i++){
//            Thread.yield();   give chance to next thread in every ittreation .
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
public class Threading {
    public static void main(String[] args) throws InterruptedException {
                count t1 = new count("count tread");
                t1.setPriority(Thread.MAX_PRIORITY); //set max priority for the Thread which is  10 .
                Thread.currentThread().setPriority(Thread.MIN_PRIORITY); //set min priority at 1 .
                t1.setDaemon(true);   //change the thread from user to daemon JVM will not wait for this thread now
                t1.start();
//                try {
//                    t1.interrupt();  interrupt the thread if it sleeps or wait .}
//                 catch (RuntimeException e) {
//                    throw new RuntimeException(e);
//                }
                t1.join(); //Main waits for t1 to terminate ...
                System.out.println("main Priority for thread  : " + t1.getName() + " is " + t1.getPriority() +  "\n" +
                        "and for main is " + Thread.currentThread().getPriority() );

    }
}
