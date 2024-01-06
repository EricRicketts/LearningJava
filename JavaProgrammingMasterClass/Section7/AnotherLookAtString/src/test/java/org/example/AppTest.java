package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    String s, s1, s2;
    int expected, result;

    @BeforeEach
    public void setUp() {
        s = "one two three";
    }

   @Test
    public void testStringLengthMethod() {
        expected = 13;
        result = s.length();
        Assertions.assertEquals(expected, result);
   }

   @Test
    public void testStringCharAtMethod() {
        char expected = 't';
        char result = s.charAt(4);
        Assertions.assertEquals(expected, result);
   }

   @Test
    public void testIndexOfStringMethod() {
        expected = 2;
        result = s.indexOf('e');
        Assertions.assertEquals(expected, result);
   }

   @Test
    public void testLastIndexOfStringMethod() {
        expected = 12;
        result = s.lastIndexOf('e');
        Assertions.assertEquals(expected, result);
   }

   @Test
    public void testIsEmptyStringMethod() {
        s = "";
        Assertions.assertTrue(s.length() == 0 && s.isEmpty());
   }

   @Test
    public void testIsBlankStringMethod() {
        s = "";
        Assertions.assertTrue(s.isBlank());
        s = "\s\t\n"; // string consisting only of spaces
        Assertions.assertTrue(s.isBlank());
   }

   @Test
    public void testSearchForSecondOccurrenceOfLetterTInString() {
        expected = 8;
        result = s.indexOf('t', 5);
        Assertions.assertEquals(expected, result);
        /*
            the string is "one two three" the indexOf searches forward and fromIndex is the index
            at which it first starts the search, that is the method will see if the character at index = 4
            is a 't'.  Notice we start at index = 5 which is the 'w' character.  So searching forward it
            will find the first occurrence of 't' at index 8 of the word "three"
        */
   }

   @Test
    public void testLastIndexWithSecondArgument() {
        s = "foobar and"; // string is 10 characters long, start at index = 8, which is the 'n' in "and"
        expected = 7;
        result = s.lastIndexOf('a', 8);
        Assertions.assertEquals(expected, result);
       /*
            Note when given the argument fromIndex, the lastIndexOf method starts from that position in
            the string and searches backwards, so in this case it starts at index 8 in the string which is
            the letter "n" of "and" and searches backwards, landing on the character 'a' at index 7.  Note
            lastIndexOf stops once it finds the target 'a' it does not look for the 'a' at index = 4.
       */
   }

   @Test
    public void testIndexOfMethodForStrings() {
        s = "four five six seven eight";
        expected = 14;
        result = s.indexOf("seven");
        Assertions.assertEquals(expected, result);
   }

   @Test
    public void testLastIndexOfForStrings() {
        expected = 4;
        result = s.lastIndexOf("two");
        Assertions.assertEquals(expected, result);
   }

   @Test
    public void testStringEqualsMethod() {
        // string equals does a character for character comparison
        s1 = "IntelliJ";
        s2 = "IntelliJ";
        Assertions.assertTrue(s1.equals(s2));
        s2 = "Intellij";
        Assertions.assertFalse(s1.equals(s2));
   }

   @Test
    public void testStringEqualsAndStringContentEqualsMethod() {
        // for String equals method to be true, both arguments must be a string, object argument is
        // not null and character sequence is identical
        // the contentEquals only checks for character by character equality, the two objects might
        // be of different types, for String equals if one the argument is not a string then it will
        // return false.  So contentEquals can check the character by character equality of a String,
        // StringBuffer, StringBuilder, CharBuffer, or Segment
        s1 = "IntelliJ";
        CharSequence s2 = "IntelliJ"; // CharSequence is cast to a string
        Assertions.assertTrue(s1.equals(s2));
        Assertions.assertTrue(s1.contentEquals(s2));
        CharSequence s3 = new StringBuffer("IntelliJ");
        Assertions.assertFalse(s1.equals(s3)); // s3 is not a String object
        Assertions.assertTrue(s1.contentEquals(s3));
    }

    @Test
    public void testStringEqualsIgnoreCaseMethod() {
        // for the equalsIgnoreCase method the argument must be a String
        s1 = "UpDoWn";
        s2 = "UPDOWN";
        Assertions.assertTrue(s1.equalsIgnoreCase(s2));
        CharSequence s3 = new StringBuffer("UPDOWN");
        // Assertions.assertFalse(s1.equalsIgnoreCase(s3)); is not allowed a compile error will result
        // because s3 is not a String object
    }

    @Test
    public void testStringStartsWithAndEndsWithMethods() {
        // String is "one two three"
        Assertions.assertTrue(s.startsWith("on"));
        Assertions.assertTrue(s.endsWith("ee"));
        Assertions.assertFalse(s.startsWith("ON")); // startsWith case-sensitive
    }

    @Test
    public void testContainsStringMethod() {
        // character sequence must match exactly in the string, second assertion has an extra space
        // in front of the "tw" sequence, which is not in the String s
        Assertions.assertTrue(s.contains(" tw"));
        Assertions.assertFalse(s.contains("  tw"));
    }

    @Test
    public void testRegionMatchesMethod() {
        /*
            In the first assertion it is false because the method signature assumes case is considered
            when comparing the strings  In the second case, a different method signature is used where
            ignoreCase is true so the comparison returns true.
            toffset - "this" offset, ooffset - "other" offset
        */
        s1 = "welcome to baeldung";
        s2 = "Me tO";
        Assertions.assertFalse(s1.regionMatches(5, s2, 0, 5));
        Assertions.assertTrue(s1.regionMatches(true, 5, s2, 0, 5));
    }
}