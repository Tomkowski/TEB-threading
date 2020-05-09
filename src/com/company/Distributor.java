package com.company;

import java.util.ArrayList;

public class Distributor {

    private final Long currentTime = System.currentTimeMillis();
    private final Garden garden;
    private final ArrayList<String> fruits;

    public Distributor(Garden garden) {
        this.garden = garden;
        fruits = new ArrayList<>();
    }

    public synchronized void putFruit(){
        String fruit = garden.getFruit();
        fruits.add(fruit);
        System.out.println(fruit + " is added to the store");
        notify();
    }

    public synchronized void deliver(String name){
        while(fruits.size() < 1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Delivering "+ fruits.remove(0) + " from "+name);
        System.out.println("Fruits left in store: "+ fruits.size());
        long delta = System.currentTimeMillis() - currentTime;
        System.out.println("Time: " + delta / 1000);
        notify();
    }
}