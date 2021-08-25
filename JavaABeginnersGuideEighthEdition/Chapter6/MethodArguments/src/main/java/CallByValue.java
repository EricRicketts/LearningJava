public class CallByValue {
    void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }
}
