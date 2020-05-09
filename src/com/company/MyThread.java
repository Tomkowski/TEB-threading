package com.company;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public synchronized void start() {
        System.out.println(getName() +" has started!");
        super.start();
    }

    @Override
    public void run() {
        super.run();
        System.out.println(getName() + " is running");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Goodbye from " + getName());
    }
}
