package com.epam.javaschool.shefer.chapter2.task5;

import org.junit.Test;

import static org.junit.Assert.*;

public class GroupTest {
    @Test
    public void addStudent() throws Exception {
        Student s1 = new Student("Vasya");
        Student s2 = new Student("Kolya");
        Student s3 = new Student("Sasha");

        Group<Double> group = new Group<>();

        group.addStudent(s1);
        group.addStudent(s2);

        assertTrue (group.hasStudent(s1));
        assertTrue (group.hasStudent(s2));
        assertFalse(group.hasStudent(s3));
        assertFalse(group.hasStudent(null));
    }

}