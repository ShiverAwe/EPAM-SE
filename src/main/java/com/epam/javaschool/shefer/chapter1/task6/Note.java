package com.epam.javaschool.shefer.chapter1.task6;

public class Note {
    private String text;

    public void setText(String newText){
        text = newText;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Note text {" + text + "}";
    }

    public Note(String text) {
        this.text = text;
    }

    public Note(){
        this.text = "";
    }
}
