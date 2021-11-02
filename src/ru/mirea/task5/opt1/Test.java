package ru.mirea.task5.opt1;

public class Test {
    public static void main(String[] args) {
        Plate plate = new Plate("Metal", 100, 10);
        plate.action();
        Fork fork = new Fork("Metal" , 30, "huge");
        fork.action();
    }
}