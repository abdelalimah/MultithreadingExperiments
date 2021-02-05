package com.company.threading;

public class IncrementThread extends Thread {

    Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println("The current value is "+counter.getInit());

        while(counter.getInit() <= 100){
            counter.increment();
        }
    }
}
