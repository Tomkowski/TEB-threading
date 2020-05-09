package com.company;

public class DeliverThread extends Thread {
    private String name;
    private Distributor distributor;

    public DeliverThread(String name, Distributor distributor){
        this.name = name;
        this.distributor = distributor;
    }

    @Override
    public void run() {

        while(true){
            distributor.deliver(name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}