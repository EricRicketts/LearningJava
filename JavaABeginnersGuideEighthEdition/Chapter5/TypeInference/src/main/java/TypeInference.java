public class TypeInference {
    private int i;

    TypeInference(int k) { i = k; }

    int geti() { return i; }
    void seti(int k) { if (k >= 0) i = k; }
}
