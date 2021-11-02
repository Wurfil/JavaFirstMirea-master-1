package ru.mirea.task6.opt2;

public class Shoes implements Priceable{
    private int price;

    public Shoes(int price) {
        this.price = price;
    }

    @Override
    public void getPrice() {
        System.out.println("This Shoes costs: " + price);
    }
}
