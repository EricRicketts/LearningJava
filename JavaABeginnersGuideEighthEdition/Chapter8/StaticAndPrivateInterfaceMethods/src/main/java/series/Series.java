package series;

public interface Series {
    int getNext();
    void reset();
    void setStart(int x);

    default int[] getNextArray(int n) { return getArray(n); }

    private int[] getArray(int n) {
        int[] vals = new int[n];
        for (int i = 0; i < n; i += 1) vals[i] = getNext();
        return vals;
    }

    default int[] skipAndGetNextArray(int skip, int n) {
        getArray(skip);
        return getArray(n);
    }

    static String staticMethod() {
        return "Foo";
    }
}
