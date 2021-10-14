package com.ngoc.draft.animals;

public class Snake extends Animal implements SnakeAction {
    public Snake() {
    }

    public Snake( String color) {
        super(1, color, "Vietnam");
    }

    @Override
    public void introduce() {
        System.out.println("Snake is an animal.");
        System.out.println("Snake's color is "+color);
    }

    @Override
    public void eat() {
        System.out.println("Snake knows eat as an animal");
    }

    @Override
    public void sleep() {
        System.out.println("Snake knows sleep an animal");
    }

    @Override
    public void crawl() {
        System.out.println("Snake knows crawl.");
    }

    @Override
    public void molt() {
        System.out.println("Snake knows molt.");
    }
}
