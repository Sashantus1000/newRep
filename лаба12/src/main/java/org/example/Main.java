package org.example;

public class Main {
    public static void main(String[] args) {
        // Создание объекта класса Tester с использованием различных конструкторов
        Tester tester1 = new Tester("Иван", "Иванов", 3, "Intermediate", 2500.0);
        Tester tester2 = new Tester("Денис", "Денисов", 5, "Advanced");
        Tester tester3 = new Tester("Александр", "Алехандров", 2);

        // Вызов метода printInfo для каждого объекта
        tester1.printInfo();
        System.out.println("------------------");
        tester2.printInfo();
        System.out.println("------------------");
        tester3.printInfo();
        System.out.println("------------------");

        // Вызов методов work с различными параметрами
        tester1.work();
        tester2.work(30);
        tester3.work();

        Tester.staticMethod();
    }
}