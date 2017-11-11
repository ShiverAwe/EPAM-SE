package com.epam.javaschool.shefer.chapter1.task6;

import java.util.*;

/**
 * Notebook
 */
public class Notebook {

    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        notebook.add("hello world");
        notebook.add(new Note("papaia is very delicious"));
        notebook.printAllNotes();
        notebook.redactNote(1);
        notebook.printAllNotes();
        notebook.deleteNote(0);
        notebook.printAllNotes();
    }

    private ArrayList<Note> notes = new ArrayList<>();

    private String readText() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter your text below. To commit enter ###");
        for (String s = sc.nextLine(); !s.equals("###"); s = sc.nextLine()) {
            sb.append(s);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public void printAllNotes() {
        for (int i = 0; i < notes.size(); i++) {
            Note note = notes.get(i);
            System.out.println("Note ID " + i);
            System.out.println(note);
        }
    }

    public void add(Note note) {
        notes.add(note);
    }

    public void add(String note) {
        notes.add(new Note(note));
    }

    /**
     * @param id index of note in list
     * @throws IndexOutOfBoundsException if id less than 0 or more than size
     */
    public void redactNote(int id) throws IndexOutOfBoundsException {
        Note note = notes.get(id);
        System.out.println(note);
        note.setText(readText());
    }

    public void deleteNote(int id) throws IndexOutOfBoundsException {
        notes.remove(id);
    }

}
