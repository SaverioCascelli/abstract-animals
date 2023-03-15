package org.animals;

public class Sparrow extends Animal implements Flyer {

    @Override
    void call() {
        System.out.println("Chip");
    }

    @Override
    void eat() {
        System.out.println("Seeds");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
