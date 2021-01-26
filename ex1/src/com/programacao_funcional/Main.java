package com.programacao_funcional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        List<String> words = new ArrayList<String>();
        words.add("IFSP");
        words.add("Linguagem de Programaçao 3");
        words.add("Instituto Federal");

        Comparator<String> comparator = new LengthComparator();
        words.sort(comparator);
        System.out.println(words);

        Consumer<String> consumer = new ForEachPrint();
        words.forEach(consumer);

    }
}

class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if(s1.length() > s2.length())
            return 1;
        if(s1.length() < s2.length())
            return -1;
        return 0;
    }
}

class ForEachPrint implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
