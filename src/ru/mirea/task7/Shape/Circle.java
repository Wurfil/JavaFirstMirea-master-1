package ru.mirea.task7.Shape;

public class Circle extends Shape{
    protected double radius;
    public Circle(){
        radius = 0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color='" + color + ", filled=" + filled + '}';
    }
}