package ru.mirea.task7.Shape;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        width = 0;
    }
    public Rectangle(double length){
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }
    public double getPerimeter() {
        return 2*width+2*length;
    }
    public String toString(){
        return ("Rectangle, length = "+length+", colour = "+color+", filled - "+ filled);
    }
}