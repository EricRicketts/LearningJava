package c_and_d;

public class D extends C {
    double c;
    double d;

    D(char a, char b, double c, double d) {
        super(0, 1, a, b);
        this.c = c;
        this.d = d;
    }

    double add() {
        return c + d;
    }

    double multiply() {
        return c * d;
    }

    char incrementA() {
        return (char) (getA() + 1);
    }
    char incrementB() {
        return (char) (getB() + 1);
    }

    char addAAndBAndIncrement() {
        int sum = (int) (getA() + getB() + 1);
        return (char) sum;
    }
}

// I cannot call this.a, this.b, a, or b because a and b have private access in C, thus they are only
// available within the same class, even subclasses cannot access them directly.  So I have to use
// default access based methods to return a and b.  Note also I cannot call getAAndB, because that
// method is private, as with the instance variables only other methods within the class can call getAAndB
