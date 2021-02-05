package com.company.threading;

public class Counter {

    private volatile int init;
    private final Object object;

    public Counter(int init) {
        this.init = init;
        this.object = new Object();
    }

    public void sayHello(){
        synchronized (this.object){
            System.out.println("Say hello");
        }

    }

    public void decrement(){
        synchronized (this){
            if(this.init < 100){
                try{
                    this.wait();
                    System.out.printf("The current thread starting decrementing is : %s \n",Thread.currentThread().getName());
                    this.init--;
                    System.out.printf("The current thread finishing decrementing is : %s \n",Thread.currentThread().getName());
                }catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }

            System.out.println("You shall all continue your work now");
        }
    }

    public synchronized void increment(){

            System.out.printf("The current thread starting incrementing is : %s \n",Thread.currentThread().getName());
            this.init++;
            if(this.getInit() > 100) this.notifyAll();
            System.out.printf("The current thread finishing incrementing is : %s \n",Thread.currentThread().getName());

    }

    public synchronized int getInit() {
        return init;
    }
}
