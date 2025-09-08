package org.example;

public class Cat {
    public String name;
    public int age;
    public String owner;

    public Cat (String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        say();
    }
    public void stand() {
        System.out.printf("%s is standing\n", name);
    }

    public void say() {
        System.out.println("Mrr!");
    }

    public void sleep() {
        System.out.println("Hrr...");
    }

    public void eat (){
        System.out.println("Beautiful food!");

    }


}
