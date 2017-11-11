package com.epam.javaschool.shefer.chapter1.task4;

public class Tasker {

    public static void main(String[] args) {
        System.out.println(
                solve(0, 2.3, 4.5, 5, 0, 1.0)
        );
    }

    public static double solve(double ... values){
        int length = values.length;
        if (length%2 != 0) throw new IllegalArgumentException("Count of values should be even");

        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < length/2; i++) {
            double item = values[i] + values[(length-1) - i];
            if (item > max) max = item;
        }
        return max;
    }
}
