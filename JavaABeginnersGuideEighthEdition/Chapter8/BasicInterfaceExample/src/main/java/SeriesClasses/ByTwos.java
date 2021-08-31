package SeriesClasses;
import seriesInterface.Series;

public class ByTwos implements Series {
    int start;
    int val;

    ByTwos() {
        start = 0;
        val = 0;
    }

    ByTwos(int s) {
        start = s;
        val = s;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    int getPrevious() {
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}

/*
    the class that uses the Series interface must implement all the methods in the interface or it must be
    declared an abstract class.  In this case, getNext(), reset(), and setStart() were the methods in Series,
    ByTwos implemented one of its own methods, getPrevious();
*/
