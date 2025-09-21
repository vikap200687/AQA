public class Dog extends Animal {
    public Dog(String name, int age, String owner) {
        super(name, age, owner);
    }

    @Override
    public void say() {
        System.out.println(getName() + " говорит: Гав-гав!");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит, свернувшись клубком.");
    }
}