package ru.mirea.task2.opt2;

public class Main {

    public static void main(String[] args) {
        Ball b1 = new Ball("Football", 5);
        Ball b2 = new Ball("basketball", 3);
        Ball b3 = new Ball("tennis", 1);
        b2.setWeight(7);
        b1.print();
        b2.print();
        b3.print();
        System.out.println(b1);
    }
}
