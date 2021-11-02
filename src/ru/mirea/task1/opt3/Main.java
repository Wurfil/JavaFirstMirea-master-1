package ru.mirea.task1.opt3;

public class Main {
    public static void main(String[] args) {
        int[] mass = {4, 3, 1, 23, 421, 423, 2, 12, 3, 6, 3};
        int sum = 0;
        for (int i = 0; i < 10; i++)
            sum += mass[i];
        System.out.println(sum);
        sum = 0;
        int i = 0;
        while (i < 10) {
            sum += mass[i];
            i++;
        }
        System.out.println(sum);
        i = 0;
        sum = 0;
        do {
            sum += mass[i];
            i++;
        } while (i <= 9);
        System.out.println(sum);
    }
}
