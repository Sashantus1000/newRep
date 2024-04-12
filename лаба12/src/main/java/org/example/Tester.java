package org.example;
public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    // Перегрузка конструкторов
    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 0.0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Intermediate");
    }

    // Перегруженные методы
    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Опыт работы в годах: " + experienceInYears);
        System.out.println("Уровень английского: " + englishLevel);
        System.out.println("Зарплата: " + salary);
    }

    public void work() {
        System.out.println("Тестирование ПО...");
    }

    public void work(int hours) {
        System.out.println("Тестирование ПО " + hours + " часов в неделю.");
    }

    // Статический метод
    public static void staticMethod() {
        System.out.println("Статический метод класса Tester вызван!");
    }
}