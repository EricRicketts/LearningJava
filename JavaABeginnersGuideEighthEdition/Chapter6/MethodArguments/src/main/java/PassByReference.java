public class PassByReference {
    int a, b;
    PassByReference(int i, int j) {
        a = i;
        b = j;
    }

    void change(PassByReference ob) {
        a = ob.a + ob.b;
        b = -ob.b;
    }
}
