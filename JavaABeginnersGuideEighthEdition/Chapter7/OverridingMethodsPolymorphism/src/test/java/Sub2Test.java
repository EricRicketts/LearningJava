import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sub2Test {

    private Sup sup;
    private Sub1 sub1;
    private Sub2 sub2;
    private Sup subRef;
    @BeforeEach
    void setUp() {
        sup = new Sup();
        sub1 = new Sub1();
        sub2 = new Sub2();
    }

    /*
        this only works because Sub1 and Sub2 are extending Sup.  So we see the output is determined by the object
        type being referred to at runtime.  in tests 2 and 3 subRef is referring to objects of type Sub1 and Sub2
        so the who() output is the same as if sub1 or sub2 were calling who().
    */
    @Test
    void whoSup() {
        subRef = sup;
        assertEquals("who() in Sup class.", subRef.who());
    }

    @Test
    void whoSub1() {
        subRef = sub1;
        assertEquals("who() in Sub1 class.", subRef.who());
    }

    @Test
    void whoSub2() {
        subRef = sub2;
        assertEquals("who() in Sub2 class.", subRef.who());
    }

}