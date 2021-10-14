package com.ngoc.draft.animals;

public class Dog extends Animal implements DogAction, JumpAction {

    public Dog() {
    }

    public Dog(int size) {
        super(size, "Green", "Lee");
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Dog is an example of animals");
        System.out.println("Dog'size is " + size);
    }

    @Override
    public void eat() {
        System.out.println("Dog knows eat as an animal");
    }

    @Override
    public void sleep() {
        System.out.println("Dog knows sleep an animal");
    }

    @Override
    public void bark() {
        System.out.println("Dog knows bark.");
    }

    @Override
    public void jump() {
        System.out.println("Dog knows jump");
    }
}
