package org.animals;

public abstract class Animal {

    public void sleep(){
        System.out.println("Zzzzz");
    }

    abstract void call();

    abstract void eat();
}
