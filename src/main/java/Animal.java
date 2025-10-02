import java.util.Scanner;

public abstract class Animal {
    private final String name;
    private final int  age;
    private final String owner;

    public Animal(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    // Геттеры для доступа к полям (полезно для наследников)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOwner() {
        return owner;
    }
    public abstract void say();

    public abstract void sleep();

    // Конкретный метод
    public void eat() {
        System.out.println("Nam-nam");
    }
}
