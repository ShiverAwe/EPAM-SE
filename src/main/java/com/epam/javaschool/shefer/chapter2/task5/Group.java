package com.epam.javaschool.shefer.chapter2.task5;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Group<MARK_TYPE extends Number> {

    private Map<Student, MARK_TYPE> students = new HashMap<>();

    public boolean hasStudent(Student key) {
        return students.containsKey(key);
    }

    public boolean addStudent(Student student){
        if (students.containsKey(student)) return false;
        students.put(student, null);
        return true;
    }

    public MARK_TYPE getMark(Student student) {
        return students.get(student);
    }

    public void setMark(Student student, MARK_TYPE mark) {
        if (!students.containsKey(student)) throw new NoSuchElementException("That student is not in this group");
        students.put(student, mark);
    }

}