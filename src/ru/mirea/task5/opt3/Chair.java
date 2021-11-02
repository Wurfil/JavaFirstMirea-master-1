package ru.mirea.task5.opt3;

public class Chair extends Furniture{
    int height;

    public Chair(String material, int weight, int price, int height) {
        super(material, weight, price);
        this.height = height;
    }
    public void info() {
        System.out.println("It is " + getMaterial() + " chair " + "weight is "
                + getWeight() + " height is " + height + " and price is " + getPrice());
    }
}
