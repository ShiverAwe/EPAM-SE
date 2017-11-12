package com.epam.javaschool.shefer.chapter2.task4;

import com.epam.javaschool.shefer.chapter2.task1.Color;
import com.epam.javaschool.shefer.chapter2.task1.Pen;
import com.epam.javaschool.shefer.chapter2.task1.PenType;
import com.epam.javaschool.shefer.chapter2.task3.Notebook;
import com.epam.javaschool.shefer.chapter2.task3.Stationery;
import com.epam.javaschool.shefer.chapter2.task3.Stickers;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Stationery> starterPack = new ArrayList<>();
        starterPack.add(
                new Pen("Shefer's pen", 333.3, Color.BLUE, PenType.BALLPOINT, "Parker"));
        starterPack.add(
                new Stickers("Common stickers", 12.4, 500, Color.BLUE));
        starterPack.add(
                new Stickers("Common stickers", 12.3, 500, Color.BLUE));
        starterPack.add(
                new Notebook("AhyperiojNotes", 120.0));

        System.out.println(starterPack);

        System.out.println("Sorting by name");
        starterPack.sort(Comparator.comparing(Stationery::getName));
        System.out.println(starterPack);

        System.out.println("Sorting by price");
        starterPack.sort(Comparator.comparing(Stationery::getPrice));
        System.out.println(starterPack);


        System.out.println("Name first, price second");
        starterPack.sort((a, b) -> {
            if (!a.getName().equals(b.getName())) {
                return a.getName().compareTo(b.getName());
            } else {
                return Double.compare(a.getPrice(), b.getPrice());
            }
        });
        System.out.println(starterPack);
    }
}
