package ru.mirea.task7.Shape;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Square square = new Square(10);
        Circle circle = new Circle(10, "red", true);
        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(circle);

    }
}
