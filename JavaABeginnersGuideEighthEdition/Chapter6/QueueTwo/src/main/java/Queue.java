public class Queue {
    private char q[];
    private int getloc, putloc;

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        for (int i = getloc; i < putloc; i+= 1) {
            q[i] = ob.q[i];
        }
    }

    Queue(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];
        for (int i = 0; i < a.length; i += 1) put(a[i]);
    }

    char get() {
        if (getloc == putloc) {
            return (char) 0;
        }
        return q[getloc++];
    }

    void put(char ch) {
        boolean queueFull = putloc == q.length;
        if (!queueFull) q[putloc++] = ch;
    }
}
