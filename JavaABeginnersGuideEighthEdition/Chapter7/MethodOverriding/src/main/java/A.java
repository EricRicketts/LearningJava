public class A {
    private int i;
    private int j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    int geti() { return i; }
    int getj() { return j; }
    void seti(int a) { i = a; }
    void setj(int b) { j = b; }

    String show() {
        return "i is: " + i + " j is: " + j;
    }
}
