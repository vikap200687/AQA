import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите питомца: 1 - Собака, 2 - Кот");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите имя питомца: ");
        String name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите имя хозяина: ");
        String owner = scanner.nextLine();

        Animal pet;
        if (choice == 1) {
            pet = new Dog(name, age, owner);
        } else if (choice == 2) {
            pet = new Cat(name, age, owner);
        } else {
            System.out.println("Неверный выбор. По умолчанию - Собака.");
            pet = new Dog(name, age, owner);
        }

        int hunger = 5;
        int happiness = 5;

        while (hunger < 10 && happiness > 0) {
            System.out.println("\nСтатус " + pet.getName() + ": Голод - " + hunger + "/10, Счастье - " + happiness + "/10");
            System.out.println("Что сделать? 1 - Покормить, 2 - Поиграть, 3 - Заставить говорить, 4 - Уложить спать, 5 - Выход");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    pet.eat();
                    hunger = Math.max(0, hunger - 2);
                    break;
                case 2:
                    System.out.println(pet.getName() + " играет!");
                    happiness = Math.min(10, happiness + 2);
                    break;
                case 3:
                    pet.say();
                    break;
                case 4:
                    pet.sleep();
                    hunger = Math.min(10, hunger + 1);
                    happiness = Math.max(0, happiness - 1);
                    break;
                case 5:
                    System.out.println("Выход из игры.");
                    return;
                default:
                    System.out.println("Неверный выбор.");
            }

            hunger = Math.min(10, hunger + 1);
            happiness = Math.max(0, happiness - 1);
        }

        System.out.println("Игра окончена. " + pet.getName() + " нуждается в заботе!");
        scanner.close();
    }
}