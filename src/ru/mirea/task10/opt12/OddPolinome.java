package ru.mirea.task10.opt12;
import java.util.Scanner;
public class OddPolinome {
    public static void solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n > 0){
            if (n % 2 == 1){
                System.out.println("| "+ n + " |");
                solution();
            }
            else
                solution();
        }
    }

    public static void main(String[] args){
        System.out.println("Enter:");
        solution();
    }
}