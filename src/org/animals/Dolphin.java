package org.animals;

public class Dolphin extends Animal {

    @Override
    void call() {
        System.out.println("Buzz");
    }

    @Override
    void eat() {
        System.out.println("Fish");
    }
}
