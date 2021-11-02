package ru.mirea.task2.opt3;


public class Main {

    public static void main(String[] args) {
        Book b1 = new Book(10, "Book1");
        Book b2 = new Book(100, "Book2");
        Book b3 = new Book(50, "Book3");
        b3.setPage(500);
        b1.print();
        b2.print();
        b3.print();
        System.out.println(b1);

    }
}