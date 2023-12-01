package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static List<Integer> addNumbersToList(int loopLimit) {
        List<Integer> numbers = new ArrayList<>();
        for (int index = 0; index < loopLimit; index++) {
                numbers.add(index);
        }
        return numbers;
    }
}
