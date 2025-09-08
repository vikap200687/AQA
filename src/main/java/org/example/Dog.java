package org.example;

public class Dog {
    public String name;
    public int age;
    public String owner;

    public Dog (String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        say();
    }
    public void say() {
        System.out.println("Gav!");
    }

    public void sleep() {
        System.out.println("Hrr...");
    }

    public void eat (){
        System.out.println("Nam-nam");

    }


}
