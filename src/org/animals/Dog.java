package org.animals;

public class Dog extends Animal {
    @Override
    void call() {
        System.out.println("Bau");
    }

    @Override
    void eat() {
        System.out.println("Kibble");
    }
}
