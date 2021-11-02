package ru.mirea.task6.opt2;

public class Tshirt implements Priceable {
    private int price;

    public Tshirt(int price) {
        this.price = price;
    }
    @Override
    public void getPrice() {
        System.out.println("This T-shirt costs: " + price);
    }
}
