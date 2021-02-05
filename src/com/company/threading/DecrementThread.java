package com.company.threading;

public class DecrementThread extends  Thread{

    private Counter counter;

    public DecrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.decrement();
        System.out.println("The current value is "+counter.getInit());
    }
}
