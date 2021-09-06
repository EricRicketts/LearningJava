package c_and_d;
import a_and_b.*;

public class C {
    private char a;
    private char b;
    private A obA;

    C(int i, int j, char a, char b) {
        this.a = a;
        this.b = b;
        obA = new A(i, j);
    }

    char getA() { return a; }
    char getB() { return b; }
    void setA(char a) { this.a = a; }
    void setB(char b) { this.b = b; }
    private String getAAndB() {
        String a = Character.toString(this.a);
        String b = Character.toString(this.b);

        return a + b;
    }

    String makeAAndBLowerCase() {
        String c = getAAndB();
        return c.toLowerCase();
    }
}

/*
    Some really important points to be made here about method access within packages.  First to access class A from
    package a_and_b I had to import the package.  Secondly, I have access to class A because, the class itself has
    public access.  However, the only way I could invoke the constructor on class A from this package was to make
    the constructor public.  Before changing the constructor to public access in class A, when I tried to create
    an instance of class A, obA = new A(i, j); I got an error from jetBrains saying I did not have access to the
    constructor in this package because of the default access of A's constructor.  When I changed the constructor
    to public A(i, j) I was able to instantiate an object of class A in this different package.

    So one cannot access a default accessible method from a different package in any case.  The method must be
    declared to be public.

    Note I can also call getAPlusB() from this package because that method has public access.  However, I cannot
    access instance variables a and b from obA directly, i.e., obA.a and obA.b would yield a compile error because
    there is default access on instance variables a and b from class A.
*/


