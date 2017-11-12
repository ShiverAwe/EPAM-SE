package com.epam.javaschool.shefer.chapter2.task2;

import com.epam.javaschool.shefer.chapter2.task3.Stationery;

import java.util.ArrayList;

public class StationeryManager {

    ArrayList<Stationery> stationeries = new ArrayList<>();

    public int size() {
        return stationeries.size();
    }

    public Stationery get(int index) {
        return stationeries.get(index);
    }

    public boolean add(Stationery stationery) {
        return stationeries.add(stationery);
    }

    public Stationery remove(int index) {
        return stationeries.remove(index);
    }

    public double getPricesSum(){
        double result = 0;
        for (Stationery st: stationeries) {
            result += st.getPrice();
        }
        return result;
    }

    @Override
    public String toString() {
        return "StationeryManager{" +
                "stationeries=" + stationeries +
                '}';
    }
}
