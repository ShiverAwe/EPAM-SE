package com.epam.javaschool.shefer.chapter1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double E = sc.nextDouble();
        int n = 1;
        double value;
        do {
            value = a(n);

        }while (E < value);

    }

    private static double a(double n) {
        return 1.0/((n+1)*(n+1));
    }
}
