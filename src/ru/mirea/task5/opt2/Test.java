package ru.mirea.task5.opt2;

public class Test {
    public static void main(String[] args) {
        Shepherd shepherd = new Shepherd("Rex", 15, 10);
        Labrador labrador = new Labrador("Tom", 5, true);
        labrador.info();
        shepherd.info();
        labrador.setAge(14);
        labrador.info();
    }
}