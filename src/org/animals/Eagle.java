package org.animals;

public class Eagle extends Animal implements Flyer {

    @Override
    void call() {
        System.out.println("Iaaaa");
    }

    @Override
    void eat() {
        System.out.println("Meat");
    }

    @Override
    public void fly() {
        System.out.println("I'm Flying");
    }
}
