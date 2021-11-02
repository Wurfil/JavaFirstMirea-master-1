package ru.mirea.task5.opt1;

public class Plate extends Dish{
    int radius;

    public Plate(String madeOf, int price, int radius) {
        super(madeOf, price);
        this.radius = radius;
    }
    public void action(){
        System.out.println("Break");
    }
}