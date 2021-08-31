package extend_interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

    private MyClass myClass;
    @BeforeEach
    void setUp() {
        myClass = new MyClass();
    }

    @Test
    void meth1() {
        assertEquals("Foo", myClass.meth1());
    }

    @Test
    void meth2() {
        assertEquals("Bar", myClass.meth2());
    }

    @Test
    void meth3() {
        assertEquals("FooBar", myClass.meth3());
    }
}