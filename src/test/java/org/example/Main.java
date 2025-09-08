package org.example;

import static java.lang.Thread.sleep;

public class Main {
    public static void main (String[] args){
        Cat cat;
        cat = new Cat("Barsic", 1, "Natalia");
        cat.sleep();
        cat.stand();
        cat.eat();

        org.example.Dog dog = new org.example.Dog("Tyzic", 2, "Natalia");
        dog.sleep();
        dog.eat();

    }
}