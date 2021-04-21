package com.company;

import java.io.File;

public class Animal {
    final public String species;
    private Double weight;
    protected String name;
    File pic;

    public Animal(String species){
        this.species = species;
    }


    void feed(){
        System.out.println("thx for food");
        this.weight += 1;
    }
}
