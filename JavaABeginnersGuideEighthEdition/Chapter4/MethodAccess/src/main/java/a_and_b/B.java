package a_and_b;

public class B extends A {
    int c;
    protected int f;

    protected B(int i, int j, int k) {
        super(i, j);
        c = k;
        f = Integer.MAX_VALUE;
    }
    public int getATimesB() { return a * b; }
}

// we have instance variables a and b of class A declared with default access.
//  1.  Obviously, a and b are everywhere visible their own class, class A
//  2.  Additionally, for a subclass in the same package, default attributes are also visible
//      so in this case, I initialized the superclass attributes a and B of class A with my call
//      to super(), now those attributes are available just like instance variables in class B
