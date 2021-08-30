public class C extends A {
    private int k;

    C(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    int getk() { return k; }
    void setk(int c) { k = c; }
    String show() { // using super.method_name we have access to parent method
        return super.show() + " " + "k is: " + k;
    }
}
