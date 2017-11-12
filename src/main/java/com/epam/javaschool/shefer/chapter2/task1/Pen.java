package com.epam.javaschool.shefer.chapter2.task1;

import com.epam.javaschool.shefer.chapter2.task3.Stationery;

public class Pen extends Stationery {
    private Color color;

    private PenType type;

    private String brand;


    public Pen(String name, double price, Color color, PenType type, String brand) {
        super(name, price);
        this.color = color;
        this.type = type;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color=" + color +
                ", type=" + type +
                ", brand='" + brand + '\'' +
                ", name=" + name +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (!name.equals(pen.getName())) return false;
        if (price != pen.getPrice()) return false;
        if (color != pen.color) return false;
        if (type != pen.type) return false;
        return brand.equals(pen.brand);
    }

    @Override
    public int hashCode() {
        int result = color.ordinal();
        result = 31 * result + name.hashCode();
        result = 31 * result + (int) price;
        result = 31 * result + type.ordinal();
        result = 31 * result + brand.hashCode();
        return result;
    }
}
