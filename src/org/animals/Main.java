package org.animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog();
        animals[1]= new Dolphin();
        animals[2]= new Eagle();
        animals[3]= new Sparrow();

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
            System.out.print("call: ");
            animal.call();
            System.out.print("eat: ");
            animal.eat();
            System.out.print("sleep: ");
            animal.sleep();
            System.out.println("------");
        }
    }
}
