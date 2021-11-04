package ru.mirea.task13.opt2;
import java.util.*;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();

        cars.add("Ford");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Volvo");
        cars.addLast("Kia");
        cars.addFirst("Tesla");
        cars.add(4, "Lexus");


        System.out.println("В списке " + cars.size() + " элементов");

        for (String car : cars)
            System.out.println(car);

        cars.set(0, "Nissan");

        System.out.println();

        System.out.println(cars.get(0));


        if (cars.contains("Ford"))
            System.out.println("Список содержит объект Ford (#" + cars.indexOf("Ford") + ")");

        cars.remove("Ford");
        cars.removeFirst();
        cars.removeLast();
    }
}