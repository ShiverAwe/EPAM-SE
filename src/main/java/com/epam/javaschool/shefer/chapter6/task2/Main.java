package com.epam.javaschool.shefer.chapter6.task2;

import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        Properties pr = new Properties();
        //InputStream input = Main.class.getResourceAsStream("/chapter6/task2/file.properties");
        //InputStream input = Main.class.getClass().getResourceAsStream("/chapter6/task2/file.properties");
       // pr.load(input);
       // pr.addFromLine("hi\\ po = k   ksl \\t sdfkj sdflk \\n skd            fj sdlfk");
        for (String key: pr.keySet()){
            System.out.println(key + " : " + pr.get(key));
        }
    }
}
