package ru.mirea.task6.opt1;

public class Book implements Nameable {
    String name;
    String author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void name() {
        System.out.println("Name of this book is: " + name + " and author is: " + author );
    }
}
