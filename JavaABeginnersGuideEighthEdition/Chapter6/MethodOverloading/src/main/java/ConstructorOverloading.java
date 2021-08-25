public class ConstructorOverloading {
    int x;

    ConstructorOverloading() {
        x = 0;
    }

    ConstructorOverloading(int i) {
        x = i;
    }

    ConstructorOverloading(double d) {
        x = (int) d;
    }

    ConstructorOverloading(int i, int j) {
        x = i + j;
    }
}
