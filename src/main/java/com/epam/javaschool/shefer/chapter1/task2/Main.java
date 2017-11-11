package com.epam.javaschool.shefer.chapter1.task2;

import java.util.Scanner;

public class Main {
    /**
     * Найти наименьший номер элемента последовательности, для которого выполняется
     * условие M. Вывести на экран этот номер и все элементы ai где i = 1, 2, ..., п.
     * M: E < 1/((n+1)^2)
     */
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Scanner sc = new Scanner(System.in);

        final double E = sc.nextDouble();

        int n = 0;
        for(double value; E <= (value = a(n)); n++)
            System.out.println(value);

        System.out.printf("PREVS VALUE: n: %d , a(n):%f , epsilon: %f %n", n-1, a(n-1), E);
        System.out.printf("FINAL VALUE: n: %d , a(n):%f , epsilon: %f %n", n, a(n), E);
    }

    private static double a(int n) {
        return 1.0/((n+1)*(n+1));
    }
}
