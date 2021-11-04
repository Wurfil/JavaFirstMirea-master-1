package ru.mirea.task13.opt3;

public class MyArrayList<T> {

    private final int INIT_SIZE = 1;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    //Добавление элемента в ArrayList, изменяя размер если это необходимо
    public void add(T item) {
        if(pointer == array.length-1)
            resize(array.length+1);
        array[pointer++] = item;
    }

    //возврат элемента по индексу
    public T get(int index) {
        return (T) array[index];
    }

    //удаление элемента по индексу
    public void remove(int index) {
        for (int i = index; i < pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length - 1);
    }

    //возвращение кол-во элементов в ArrayList
    public int size() {
        return pointer;
    }

    //метод для изменения размера массива
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    public static void main(String[] args) {
        MyArrayList<String> cars = new MyArrayList<String>();

        cars.add("Ford");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Kia");
        cars.add("Tesla");

        for (int i = 0; i < cars.size(); i++)
            System.out.println(cars.get(i));

        System.out.println("");

        //подсчет эл-ов в коллекции
        System.out.println("В списке " + cars.size() + " элементов");

        //удаление объектов
        cars.remove(4);
    }
}