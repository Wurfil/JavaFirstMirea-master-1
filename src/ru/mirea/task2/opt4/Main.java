package ru.mirea.task2.opt4;


public class Main {

    public static void main(String[] args) {
        Dog bulldog = new Dog("Tom", 3, 7);
        System.out.println(bulldog);
        bulldog.toHumanAge();
        Dog poodel = new Dog("Rex", 5, 1);
        System.out.println(poodel);
        poodel.toHumanAge();
    }
}