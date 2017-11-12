package com.epam.javaschool.shefer.chapter2.task3;

public class Notebook extends Stationery {

    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Notebook(String name, double price) {
        super(name, price);
    }
}
