package com.epam.javaschool.shefer.chapter3.task1;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    static String[] KEYWORDSARR = {
            "abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package", "synchronized", "boolean", "do",
            "if", "private", "this", "break", "double", "implements", "protected", "throw", "byte", "else", "import", "public", "throws",
            "case", "enum", "instanceof", "return", "transient", "catch", "extends", "int", "short", "try", "char", "final", "interface",
            "static", "void", "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"
    };

    public static InputStream getIputStream() {
        return Main.class.getClass().getResourceAsStream("chapter3/task1/javaclass.txt");
    }

    public static void main(String[] args) {

        Map<String, Integer> keywords = new HashMap<>();
        for (String word : KEYWORDSARR) {
            keywords.put(word, 0);
        }

        StringBuilder sb = new StringBuilder();
        try (
                InputStream input = Main.class.getClass().
                        getResourceAsStream("/chapter3/task1/javaclass.txt")) {
            int c;
            while ((c = input.read()) != -1) {
                sb.append((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringTokenizer tokenizer = new StringTokenizer(sb.toString());
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (keywords.containsKey(token)) {
                keywords.put(token, keywords.get(token)+1);
            }
        }

        for (Map.Entry<String, Integer> entry: keywords.entrySet()) {
            if (entry.getValue() > 0){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}