package com.epam.javaschool.shefer.chapter2.task3;

import com.epam.javaschool.shefer.chapter2.task1.Color;

public class Stickers extends Stationery{
    private int count;
    private Color color;

    @Override
    public String toString() {
        return "Stickers{" +
                "count=" + count +
                ", color=" + color +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Stickers(String name, double price, int count, Color color) {
        super(name, price);
        this.count = count;
        this.color = color;
    }
}
