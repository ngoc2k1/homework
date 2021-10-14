package com.ngoc.draft.animals;

public class Bird extends Animal implements BirdAction, JumpAction {

    @Override
    public void eat() {
        System.out.println("Bird knows eat as an animal");
    }

    @Override
    public void sleep() {
        System.out.println("Bird knows sleep as an animal");
    }

    @Override
    public void fly() {
        System.out.println("Bird knows fly");
    }

    @Override
    public void jump() {
        System.out.println("Bird knows jump");
    }
}
