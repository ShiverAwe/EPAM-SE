package com.epam.javaschool.shefer.chapter2.task5;

import java.util.HashSet;
import java.util.Set;

public class Subjects {

    public static final Group<Double>  MATH    = new Group<>();
    public static final Group<Double>  PHYSICS = new Group<>();
    public static final Group<Integer> JAVA    = new Group<>();
    public static final Group<Integer> ENGLISH = new Group<>();

    private static Set<Group> groups = new HashSet<>();

    static {
        groups.add(MATH);
        groups.add(PHYSICS);
        groups.add(JAVA);
        groups.add(ENGLISH);
    }

}