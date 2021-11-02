package ru.mirea.task2.opt1;

public class Shape {
    private String name;
    private int angles;
    private int square;

    public Shape(String name, int angles, int square) {
        this.name = name;
        this.angles = angles;
        this.square = square;
    }

    @Override
    public String toString() {
        return "This is " + name + "it has " + angles + "angles and square of this shape is " + square;
    }
}
