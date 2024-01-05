package org.example;

public class App {

    public String bulletedString() {
        return "Print a Bulleted List:\n" +
                "\s\s\s\s• First Point\n" +
                "\s\s\s\s\s\s\s\s• Sub Point";
    }
}
/*
I had to use \s multiple times because I set up IntelliJ to convert tabs to spaces
in the instructor example he used tabs.  I used tabs on my text block for the text
and this was converted to spaces by IntelliJ, so the assertion worked.
*/
