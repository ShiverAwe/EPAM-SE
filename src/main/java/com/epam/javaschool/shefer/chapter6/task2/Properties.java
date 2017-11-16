package com.epam.javaschool.shefer.chapter6.task2;

import com.sun.istack.internal.NotNull;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Properties {

    Map<String, String> properties = new HashMap<>();

    public void load(File file){
        try (Scanner sc = new Scanner(new BufferedReader(new FileReader(file)))){
            StringBuilder sb = new StringBuilder();
            while (sc.hasNext()){
                String s = sc.nextLine();

                // Ignoring comments
                if (s.charAt(0)=='!' || s.charAt(0)=='#') continue;

                // Concatenating backslash-separated lines
                while (s.charAt(s.length()-1) == '\\') {
                    if (sc.hasNext()) {
                        s += sc.nextLine();
                    } else {
                        throw new RuntimeException(new EOFException());
                    }
                }
                parse(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void parse(String line){
        Pattern p = Pattern.compile(
                "^((?:(?:\\\\[ ]?)|[\\w])+)(?:\\s*[=:]\\s*)(.+)$"
        );

        Matcher m = p.matcher(line);

        if (!m.matches()) return;

        String key = safeKey(m.group(1));
        String value = safeValue(m.group(2));

        System.out.println(key + " : " + value);

    }

    private static String safeValue(String line){
        line = line.replaceAll("\\s+", " ");
        line = line.replaceAll("(\\\\n)", "\n");
        line = line.replaceAll("(\\\\t)", "\t");
        line = line.replaceAll("(\\\\r)", "\r");
        return line;
    }

    private static String safeKey(String line){
        line = line.replaceAll("(\\\\ )", " ");
        return line;
    }

}
