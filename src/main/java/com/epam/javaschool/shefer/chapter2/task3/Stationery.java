package com.epam.javaschool.shefer.chapter2.task3;

abstract public class Stationery{

    protected String name;
    protected double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Stationery{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Stationery(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

