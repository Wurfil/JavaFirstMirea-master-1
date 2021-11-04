package ru.mirea.task10.opt13;

import java.util.Scanner;

public class OddStatemant {
    public static void solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n > 0){
            System.out.println(n);
            int m = in.nextInt();
            if (m > 0)
                solution();
        }
    }

    public static void main(String[] args){
        System.out.println("Enter: ");
        solution();
    }
}