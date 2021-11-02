package ru.mirea.task3.opt3;

public class Book{
    private int year;
    private String name;
    private String auth;

    public Book(int year, String name, String auth) {
        this.year = year;
        this.name = name;
        this.auth = auth;
    }
    public String toString() {
        return "Year of book is: " + this.year +" name: " + this.name;
    }
    public void print(){
        System.out.println("Name of this book is " + name + " and writer is " + auth + "and year is "+  year);
    }
}
