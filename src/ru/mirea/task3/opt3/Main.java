package ru.mirea.task3.opt3;


public class Main{

    public static void main(String[] args) {
        Book b1 = new Book(1870, "Book first", "A.S.Pushkin");
        Book b2 = new Book(1875, "Book second", "A.S.Pushkin");
        Book b3 = new Book(1861, "Book third", "F.M.Dostoevsky");
        b1.print();
        b2.print();
        b3.print();
        System.out.println(b1);

    }
}