package ru.mirea.task2.opt2;

public class Ball {
    private String brand;
    private int weight;

    public Ball(String brand, int weight) {
        this.brand = brand;
        this.weight = weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString()
    {
        return this.brand + " weight: " + this.weight;
    }
    public  void print() {
        System.out.println("Brand of this ball is " +  this.brand + "and weight " + this.weight);
    }
}