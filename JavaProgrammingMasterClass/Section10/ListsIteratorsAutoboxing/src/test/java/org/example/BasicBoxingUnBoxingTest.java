package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BasicBoxingUnBoxingTest {

    public static ArrayList<Integer> getList(int... varargs) {
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }

        return aList;
    }

    @Test
    public void testFactoryMethod() {
        Integer boxedInt = Integer.valueOf(15); // preferred over new Integer; but unnecessary
        Assertions.assertEquals("java.lang.Integer", boxedInt.getClass().getName());
        // note new Integer(int value) is deprecated since JDK 9 avoid its use
    }

    @Test
    public void testDirectAssignment() {
        Integer autoBoxedInt = 15; //
        int autoUnboxedInt = autoBoxedInt;
       Assertions.assertEquals("java.lang.Integer", Integer.valueOf(autoUnboxedInt).getClass().getName());
       // best we can do here is to manually box the primitive value and then see if we get the boxed class
    }

    @Test
    public void testAutoBoxingForArrays() {
        Integer[] integerWrapperArray = new Integer[5];
        // the assignments to each individual array location are autoboxed, no need to manually box the values
        integerWrapperArray[0] = 10;
        integerWrapperArray[1] = 20;
        integerWrapperArray[2] = 30;
        integerWrapperArray[3] = 40;
        integerWrapperArray[4] = 50;
        Assertions.assertEquals("java.lang.Integer", integerWrapperArray[0].getClass().getName());
    }

    @Test
    public void testAutoboxingForArrayLiteralAssignments() {
        // the literal assignment is of primitive type character, but Java autoboxed each character primitive to
        // a Character class, because the array was of type Character
        Character[] characterWrapperArray = {'a', 'b', 'c', 'd', 'e'};
        Assertions.assertEquals("java.lang.Character", characterWrapperArray[4].getClass().getName());
    }

    @Test
    public void testManuallyBoxIntValues() {
        // in the method we manually boxed the primitive arguments, since the method was declared to return
        // a list of Integer class then all elements in the list will be of the Integer class.
        Assertions.assertEquals("java.lang.Integer",
                getList(1, 2, 3, 4, 5).get(3).getClass().getName());
    }

    @Test
    public void testAutomaticBoxingForAList() {
        // we can do automatically what the method under test did in the above assertion
        // Java will automatically box a list of primitives if the receiving list is of the wrapper class type
        List<Integer> aList = List.of(1, 2, 3, 4, 5);
        Assertions.assertEquals("java.lang.Integer", aList.get(4).getClass().getName());
    }
}
