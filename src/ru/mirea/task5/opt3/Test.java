package ru.mirea.task5.opt3;

public class Test {
    public static void main(String[] args) {
    Sofa sofa = new Sofa("leather", 60, 1000, 4);
    sofa.info();
    Chair chair = new Chair("wood", 10, 20, 140);
    chair.info();
    }
}
