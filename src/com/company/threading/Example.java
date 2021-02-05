package com.company.threading;

public class Example {

    public Example() {

        try{
            exp01();
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    public void exp01() throws InterruptedException {

        Counter counter = new Counter(0);

        IncrementThread inc = new IncrementThread(counter);
        DecrementThread dec1 = new DecrementThread(counter);
//        EchoThread echo = new EchoThread(counter);

        inc.start();
        dec1.start();


    }

    public static void main(String[] args) {
        new Example();
    }
}
