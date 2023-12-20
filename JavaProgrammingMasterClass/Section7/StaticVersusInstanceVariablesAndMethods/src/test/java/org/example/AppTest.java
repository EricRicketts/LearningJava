package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;

public class AppTest {

    private final String firstClassName = "firstClassName";
    private final String secondClassName = "secondApp";
    private static App firstApp, secondApp;

    @BeforeEach
    public void setUp() {
        firstApp = new App("firstApp");
        secondApp = new App("secondApp");
    }

    @Test
    public void testFirstClassVariable() {
        // immediately below is the preferred way of calling for an static variable
        // use the class name itself to retrieve the value for the static variable
        // Note one still has to use a method, albeit a static method, to return the
        // class variable because the access modifier is private.

        Assertions.assertEquals(firstClassName, App.getFirstClassName());

        // Note below we are calling for the static variable, "firstClassName" from an object, using
        // an instance method.  This is not best practice as static variables should be
        // access from the class itself, as was done above.  However, for demonstration
        // purposes we will do it in this test suite to illustration the behavior of static variables.

        new ArrayList<>(Arrays.asList(firstApp, secondApp)).forEach(appObj -> {
            Assertions.assertEquals(firstClassName, appObj.getFirstClassNameFromObject());
        });

        // note though two different objects accessed the static variable, "firstClassName" the
        // value was the same each time.  This is because static variables exist as the class
        // level and thus their values are common between instances of the class.

        // set new firstClassName and then retrieve the new class name from a call to the class
        // and from a class to each instance, it should be the same for both the class and instances
        String newFirstClassName = "FizzBuzz";
        App.setFirstClassName(newFirstClassName);
        Assertions.assertEquals(newFirstClassName, App.getFirstClassName());
        Assertions.assertEquals(newFirstClassName, firstApp.getFirstClassNameFromObject());
        Assertions.assertEquals(newFirstClassName, secondApp.getFirstClassNameFromObject());
    }

    @Test
    public void testSecondClassVariable() {
        // initial assertion on secondClassName static variable
        new ArrayList<>(Arrays.asList(firstApp, secondApp)).forEach(appObj -> {
            Assertions.assertEquals(secondClassName, appObj.getSecondClassNameFromObject());
        });

        // now change the static variable, it changes across both objects
        String newSecondClassName = "FooBar";
        App.setSecondClassName(newSecondClassName);

        new ArrayList<>(Arrays.asList(firstApp, secondApp)).forEach(appObj -> {
            Assertions.assertEquals(newSecondClassName, appObj.getSecondClassNameFromObject());
        });
        // call directly from the class
        Assertions.assertEquals(newSecondClassName, App.getSecondClassName());
    }

    @Test
    public void testInstanceVariable() {
        // the difference with instance variables is that they are scoped at the object level
        // so unlike static variables, instance variables can be unique to each object

        // instance variable not set
        new ArrayList<>(Arrays.asList(firstApp, secondApp)).forEach(appObj -> {
            Assertions.assertNull(appObj.getInstanceVariable());
        });

        // set instance variable on each object, now note each object has a different value
        // for their instance variables
        String firstInstanceVariableValue = "OneTwo";
        String secondInstanceVariableValue = "ThreeFour";
        firstApp.setInstanceVariable(firstInstanceVariableValue);
        secondApp.setInstanceVariable(secondInstanceVariableValue);

        Assertions.assertEquals(firstInstanceVariableValue, firstApp.getInstanceVariable());
        Assertions.assertEquals(secondInstanceVariableValue, secondApp.getInstanceVariable());
    }
}
