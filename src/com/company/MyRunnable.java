package com.company;

public class MyRunnable implements Runnable {

    String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while(true){
            try {
                System.out.println("Hello from runnable - "+name);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
