package com.epam.javaschool.shefer.chapter6.task2;

public class Main {
    public static void main(String[] args) {
//        String line = "a\\nb\\tc\\tde";
//        line = line.replaceAll("(\\\\n)", "\n");
//        line = line.replaceAll("(\\\\t)", "\t");
//        line = line.replaceAll("(\\\\r)", "\r");
//        System.out.println(line);

        Properties pr = new Properties();
        pr.parse("hi\\ po = k   ksl \\t sdfkj sdflk \\n skd            fj sdlfk");
    }
}
