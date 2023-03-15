package org.animals;

public class Sparrow extends Animal {

    @Override
    void call() {
        System.out.println("Chip");
    }

    @Override
    void eat() {
        System.out.println("Seeds");
    }
}
