package com.ngoc.draft.animals;

public class Snake extends Animal implements Molt , Crawl{
    public Snake() {
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    public Snake(String color) {
        super(1, color, "Vietnam");
    }

    public Snake(int size, String color, String house) {
        this.size=2*size;
    }

    @Override
    public void introduce() {
        System.out.println("Snake is an animal.");
        System.out.println("Snake's size is "+size); //
        int size=5;
        System.out.println("Size'snake:"+this.size);//do có 1 biến cùng tên
        System.out.println("Size:"+size);
    }

    @Override
    public void eat() {
        System.out.println("Snake knows eat as an animal.");
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

    @Override
    public String toString() {
        return super.toString();
    }
}
