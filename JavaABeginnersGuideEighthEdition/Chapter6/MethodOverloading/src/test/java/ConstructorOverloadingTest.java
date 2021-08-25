import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorOverloadingTest {

    @Test
    void constructorNoArguments() {
        ConstructorOverloading ob = new ConstructorOverloading();
        assertEquals(0, ob.x);
    }

    @Test
    void constructorOneIntArgument() {
        ConstructorOverloading ob = new ConstructorOverloading(5);
        assertEquals(5, ob.x);
    }

    @Test
    void constructorOneDoubleArgument() {
        ConstructorOverloading ob = new ConstructorOverloading(17.23);
        assertEquals(17, ob.x);
    }

    @Test
    void constructorTwoIntArguments() {
        ConstructorOverloading ob = new ConstructorOverloading(5, 10);
        assertEquals(15, ob.x);
    }

}