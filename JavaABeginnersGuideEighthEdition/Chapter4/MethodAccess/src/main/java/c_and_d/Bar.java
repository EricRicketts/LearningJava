package c_and_d;
import a_and_b.*;

public class Bar extends B {
    B obB;
    int z;
    int y;

    Bar(int z) {
        super(0, 1, 2);
        this.z = z;
        y = f;
    }
}
/*
   Very important point about protected access here.  I imported all classes from the package a_and_b, so classes A,
   B, and Foo got imported.  However, in order to access the protected instance variable f, from this package, I
   needed to make Bar a subclass of one of the class in package a_and_b.  In this case Bar is a subclass of B, so
   as a subclass even in a different package it has access to the protected instance variable f.  However, note I
   could not call the B constructor without making that protected as well.
*/
