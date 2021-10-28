package com.ngoc.draft.animals;

import java.util.Objects;

public abstract class Animal {
    protected int size;
    protected String color;
    protected String house;

    public Animal() {

    }
    public Animal(int size, String color, String house) {
        this.size = size;
        this.color = color;
        this.house = house;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Animal)) return false;
        Animal a = (Animal) o; //this snake , o dog
        return this.size==a.size;
    }
    public abstract void eat();

    public abstract void sleep();

    public void introduce(){
        System.out.println("It is an animal.");
    }
}
