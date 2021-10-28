package com.ngoc.draft.animals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(3);
        Bird bird = new Bird();
        Snake snake = new Snake(1, "Yellow","VN");
        System.out.println("Dog:");
        dog.introduce();
        System.out.println();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.jump();
        System.out.println("----");
        System.out.println("Bird:");
        bird.introduce();
        System.out.println();
        bird.eat();
        bird.sleep();
        bird.fly();
        bird.jump();
        System.out.println("----");
        System.out.println("Snake:"+snake);  //toString
        snake.size=4;
        System.out.println(snake.size);
        snake.setSize(3);
        System.out.println(snake.getSize());
        snake.introduce();
        System.out.println();
        snake.eat();
        snake.sleep();
        snake.crawl();
        snake.molt();
        System.out.println(snake.equals(dog));
        System.out.println(snake.hashCode());
        System.out.println(Dog.b+" "+dog.a);
        dog=null;
        System.out.println(Dog.b+" ");
        System.out.println(dog.a);
    }
}
