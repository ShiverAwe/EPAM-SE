package com.epam.javaschool.shefer.chapter2.task2;

import com.epam.javaschool.shefer.chapter2.task1.Color;
import com.epam.javaschool.shefer.chapter2.task1.Pen;
import com.epam.javaschool.shefer.chapter2.task1.PenType;
import com.epam.javaschool.shefer.chapter2.task3.Notebook;
import com.epam.javaschool.shefer.chapter2.task3.Stickers;

public class Main {
    public static void main(String[] args) {
        StationeryManager sm = new StationeryManager();
        sm.add(
                new Pen("Shefer's pen", 333.3, Color.BLUE, PenType.BALLPOINT, "Parker"));
        sm.add(
                new Stickers("Common stickers", 12.4, 500, Color.BLUE));
        sm.add(
                new Stickers("Common stickers", 12.3, 500, Color.BLUE));
        sm.add(
                new Notebook("AhyperiojNotes", 120.0));

        System.out.println(sm);

        System.out.printf("Summary price : %f", sm.getPricesSum());

    }
}
