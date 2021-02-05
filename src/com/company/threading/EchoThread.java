package com.company.threading;

public class EchoThread extends Thread {

    private Counter counter;

    public EchoThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.sayHello();
    }
}
