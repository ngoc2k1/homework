package com.ngoc.draft.animals;

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

    public abstract void eat();

    public abstract void sleep();

    public void introduce(){
        System.out.println("It is an animal.");
    }
}
