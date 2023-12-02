package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static List<List<Integer>> compareLoops(int loopEnd) {
        List<List<Integer>> listsOfLists = new ArrayList<>(new ArrayList<>());
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < loopEnd; index++) list.add(index);
        listsOfLists.add(list);
        list = new ArrayList<>();

        int i = 0;
        while (i < loopEnd) {
            list.add(i);
            i++;
        }
        listsOfLists.add(list);
        list = new ArrayList<>();

        int j = 0;
        do {
            list.add(j);
            j++;
        } while (j < loopEnd);
        listsOfLists.add(list);

        return listsOfLists;
    }

    public static List<Integer> multiplesOfFive(int end) {
        List<Integer> listOfFives = new ArrayList<>();
        int number = 0;
        while (number < end) {
            number += 5;
            if (number % 25 == 0) continue;
            listOfFives.add(number);
        }
        return listOfFives;
    }
}
