package ru.mirea.task3.opt1;

class Circle {
    private String name;
    private int radius;
    private int x;
    private int y;

    public Circle(String name, int radius, int x, int y) {
        this.name = name;
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "This is " + name + " circle. Radius is  " + radius + " . Center in " + x + ":" + y;
    }
}