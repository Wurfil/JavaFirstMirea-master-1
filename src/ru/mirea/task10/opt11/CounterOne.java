
package ru.mirea.task10.opt11;

import java.util.Scanner;

public class CounterOne {
    public static int solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n == 1){
            int m = in.nextInt();
            if (m == 1)
                return solution() + n + m;
            else{
                int k = in.nextInt();
                if (k == 1)
                    return solution() + n + m + k;
                else
                    return n + m + k;
            }
        }
        else {
            int m = in.nextInt();
            if (m == 1)
                return solution() + n + m;
            else return n + m;
        }
    }

    public static void main(String[] args){
        System.out.println("Приведите Вашу последовательность: ");
        System.out.println(solution());
    }
}