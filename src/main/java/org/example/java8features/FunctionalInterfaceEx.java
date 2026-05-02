package org.example.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterfaceEx {

    public static void main(String[] args) {
        //Consumer
        Consumer<Integer> display = (value) -> System.out.println(value);
        display.accept(10);

        Consumer<List<Integer>> modify = (list) -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, 2 * list.get(i));
            }
        };

        Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.println(a));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        modify.accept(list);

        dispList.accept(list);
    }
}
