package com.epam.javaschool.shefer.chapter1.task3;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Tasker {

    public static void main(String[] args) {
        Tasker tasker = new Tasker(5.0, 1.0, 10.0);
        tasker.start();
    }


    private UnaryOperator<Double> function = ((d) -> Math.tan(2*d)-3);

    /**
     * Discretization step
     */
    private final double h;

    /**
     * From value
     */
    private final double a;

    /**
     * To value
     */
    private final double b;


    public void start(){
        for (double p = a; p <= b; p++){
            System.out.printf("%3.3f -> %3.3f %n", p, function.apply(p));
        }
    }

    public Tasker(double h, double a, double b) {
        this.h = h;
        this.a = a;
        this.b = b;
    }

    public Tasker(UnaryOperator<Double> function, double h, double a, double b) {
        this.function = function;
        this.h = h;
        this.a = a;
        this.b = b;
    }
}
