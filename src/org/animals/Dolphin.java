package org.animals;

public class Dolphin extends Animal implements Swimmer {

    @Override
    void call() {
        System.out.println("Buzz");
    }

    @Override
    void eat() {
        System.out.println("Fish");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }
}
