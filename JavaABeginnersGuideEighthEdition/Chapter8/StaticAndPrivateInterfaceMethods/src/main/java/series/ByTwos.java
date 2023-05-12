package series;

public class ByTwos implements Series {
    int start;
    int val;

    ByTwos() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public int getPrevious() {
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int n) {
        val = n;
        start = n;
    }
}