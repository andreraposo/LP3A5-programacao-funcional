package com.programacao_funcional;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("IFSP");
        words.add("Linguagem de Programaçao 3");
        words.add("Instituto Federal");

        words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(words);

        words.forEach(s -> System.out.println(s));
    }
}
