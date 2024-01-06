package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    String s, expected, result;

    @BeforeEach
    public void setUp() {
        // u2007 is a figure space
        s = "\t\s\sone two three\n";
    }

    @Test
    public void testTrimAndStringString() {
        // in this case trim and strip do the same things, remove any space characters
        // below or equal to codepoint u0020
        expected = "one two three";
        result = s.trim();
        Assertions.assertEquals(expected, result);
        result = s.strip();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStripLeadingAndStripTrailing() {
        expected = "one two three\n";
        result = s.stripLeading();
        Assertions.assertEquals(expected, result);
        expected = "\t\s\sone two three";
        result = s.stripTrailing();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testToLowerCaseAndToUpperCase() {
        s = "four five";
        expected = "FOUR FIVE";
        result = s.toUpperCase();
        Assertions.assertEquals(expected, result);
        result = expected.toLowerCase();
        Assertions.assertEquals(s, result);
    }

    @Test
    public void testSubstringMethod() {
        s = "11/20/1960";
        expected = "1960";
        result = s.substring(6); // goes from index 6 to the end of the string
        Assertions.assertEquals(expected, result);
        expected = "20";
        result = s.substring(3, 5);  // last index not included in the substring, set it at one
        // index beyond the index of the last character to include
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStringJoinMethod() {
        // first argument in join is the delimiter string
        expected = "11/20/1960";
        result = String.join("/", "11", "20", "1960");
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStringConcatMethod() {
        expected = "foobar";
        s = "foo";
        result = s.concat("bar");
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStringReplaceMethod() {
        // this method only takes char or string as arguments
        s = "11/20/1960";
        expected = "11-20-1960";
        result = s.replace("/", "-");
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStringReplaceFirstMethod() {
        // takes regex as arguments
        s = "11/20/1960";
        expected = "11-20/1960";
        result = s. replaceFirst("/", "-");
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStringReplaceAllMethod() {
        // takes regex as arguments
        s = "foo bar";
        expected = "fooAbar";
        result = s.replaceAll("\\s", "A");
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStringRepeatMethod() {
        s = "abc\n";
        expected = "abc\nabc\nabc\n";
        result = s.repeat(3);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStringIndentMethod() {
        // indent will indent the number of spaces and insert a new line for a single line string
        s = "abc";
        expected = "  abc\n";
        result = s.indent(2);
        Assertions.assertEquals(expected, result);
    }
}
