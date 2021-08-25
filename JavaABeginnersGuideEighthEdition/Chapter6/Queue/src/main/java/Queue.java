public class Queue {
    private char q[]; // this array holds the queue
    private int putloc, getloc; // put and get indices

    Queue(int size) {
        q = new char[size]; // allocate memory for queue
        putloc = getloc = 0; // starting and ending indices are the same
    }

    char get() {
        if (getloc == putloc) {
            return (char) 0;
        }
        return q[getloc++]; // return char at getloc then increment getloc after the return
    }

    void put(char ch) {
        boolean endOfQueue = (putloc == q.length);
        if (!endOfQueue) q[putloc++] = ch; // add ch to q then move the index
    }
}

/*
    I really like how Java works here, unlike in Ruby where it is actually possible to access a private
    attribute you cannot do so in Java without a compile error taking place.  In this case q, putloc, and getloc
    can only be accessed through method calls.  So this Queue class is really a "black box" a user cannot access
    the internal workings of the class, he can only use what is given to him via the public methods.
*/
