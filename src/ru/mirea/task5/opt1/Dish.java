package ru.mirea.task5.opt1;

public abstract class Dish {
    String madeOf;
    int price;

    public Dish(String madeOf, int price) {
        this.madeOf = madeOf;
        this.price = price;
    }

    public String getMadeOf() {
        return madeOf;
    }

    public void setMadeOf(String madeOf) {
        this.madeOf = madeOf;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void action(){
        System.out.println("Purchase");
    }
}