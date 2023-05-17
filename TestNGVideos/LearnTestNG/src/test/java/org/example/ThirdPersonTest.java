package org.example;

import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

// the purpose of this test is to demonstrate the workings of TestNG Annotations
public class ThirdPersonTest {
    List<String> expectedOrder = new ArrayList<>(
            List.of(
                    "before suite", "before test", "before class",
                    "before method", "test one", "after method",
                    "before method", "test two", "after method",
                    "after class", "after test", "after suite"
            )
    );

    List<String> annotationOrder = new ArrayList<>();

    @BeforeSuite
    public void beforeSuite() {
        annotationOrder.add("before suite");
    }

    @BeforeTest
    public void beforeTest() {
        annotationOrder.add("before test");
    }

    @BeforeClass
    public void beforeClass() {
        annotationOrder.add("before class");
    }

    @BeforeMethod
    public void beforeMethod() {
        annotationOrder.add("before method");
    }

    @Test
    public void testOne() {
        annotationOrder.add("test one");
        Assert.assertEquals(annotationOrder.get(4), "test one");
    }

    @Test
    public void testTwo() {
        annotationOrder.add("test two");
        Assert.assertEquals(annotationOrder.get(7), "test two");
    }

    @AfterMethod
    public void afterMethod() {
        annotationOrder.add("after method");
    }

    @AfterClass
    public void afterClass() {
        annotationOrder.add("after class");
    }

    @AfterTest
    public void afterTest() {
        annotationOrder.add("after test");
    }

    @AfterSuite
    public void afterSuite() {
        annotationOrder.add("after suite");
        Assert.assertEquals(annotationOrder, expectedOrder);
    }
}
