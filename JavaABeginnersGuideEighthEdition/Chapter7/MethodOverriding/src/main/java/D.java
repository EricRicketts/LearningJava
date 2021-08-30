public class D extends A {
    private int k;

    D(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    int getk() { return k; }
    void setk(int c) { k = c; }
    // in this case the method is overloaded, from a instance of D, say d, we can call d.show() and it will return
    // what is defined as show in A.
    String show(String msg) {
        return msg + " k is: " + k;
    }
}
