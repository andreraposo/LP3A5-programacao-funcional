package com.programacao_funcional;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

    }
}
