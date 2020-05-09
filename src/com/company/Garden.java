package com.company;

import java.util.Random;

public class Garden {
    private String[] fruits = {"Apple", "Cherry", "Strawberry", "Currants", "Pear"};

    public String getFruit(){
        int random = new Random().nextInt(fruits.length);
        return fruits[random];
    }
}
