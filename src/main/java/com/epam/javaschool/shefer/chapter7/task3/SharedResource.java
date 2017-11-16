package com.epam.javaschool.shefer.chapter7.task3;

import java.util.ArrayList;
import java.util.List;

public class SharedResource {
    private List<Integer> list;

    public SharedResource() {
        list = new ArrayList<>();
    }

    public void setElement(Integer element) {
        list.add(element);
    }

    public Integer getELement() {
        if (elementsAvailable()) {
            return list.remove(0);
        }
        return null;
    }

    public Boolean elementsAvailable(){
        synchronized (list) {
            return (list.size() > 0);
        }
    }
}
