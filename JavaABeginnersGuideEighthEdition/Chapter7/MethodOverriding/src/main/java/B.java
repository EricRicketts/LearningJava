public class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    int getk() { return k; }
    void setk(int c) { k = c; }
    String show() { // overrides show in A because they have the same signature
        return "k is: " + k;
    }
}
