public class Cat extends Animal {
    public Cat(String name, int age, String owner) {
        super(name, age, owner);
    }

    @Override
    public void say() {
        System.out.println(getName() + " говорит: Мяу!");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит на подоконнике.");
    }
}