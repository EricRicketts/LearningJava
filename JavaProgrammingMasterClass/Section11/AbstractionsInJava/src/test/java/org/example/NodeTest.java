package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NodeTest {

    private Node node, rightNode, leftNode;
    private String expected, results;

    @BeforeEach
    public void setUp() {
        node = new Node("def");
        rightNode = new Node("ghi");
        leftNode = new Node("abc");
        node.setNext(rightNode);
        node.setPrevious(leftNode);
    }

    @Test
    public void testGetRightLink() {
        expected = "ghi";
        results = (String) node.next().getValue();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testGetLeftLink() {
        expected = "abc";
        results = (String) node.previous().getValue();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testCompareToGreaterThan() {
        Assertions.assertTrue(rightNode.compareTo(node) > 0);
    }

    @Test
    public void testCompareToLessThan() {
        Assertions.assertTrue(leftNode.compareTo(node) < 0);
    }

    @Test
    public void testCompareToEqual() {
        Node testNode = new Node("def");
        Assertions.assertEquals(0, node.compareTo(testNode));
    }
}
