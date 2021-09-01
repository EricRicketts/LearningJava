package series;

public interface Series {
    int getNext(); // since the adopting class must implement getNext() it can be called in getNextArray
    void reset();
    void setStart(int x);

    default int[] getNextArray(int n) {
        int[] vals = new int[n];

        for (int i = 0; i < n; i += 1) {
            vals[i] = getNext();
        }
        return vals;
    }
}
