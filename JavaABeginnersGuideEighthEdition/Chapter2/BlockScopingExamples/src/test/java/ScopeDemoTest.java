import org.junit.jupiter.api.Test;

import javax.print.attribute.HashPrintServiceAttributeSet;

import static org.junit.jupiter.api.Assertions.*;

class ScopeDemoTest {

    @Test
    void testBlockScopeOuterScope() {
        assertEquals("x (outer scope) is: 11", ScopeDemo.blockScope(11));
    }

    @Test
    void testBlockScopeInnerScope() {
        assertEquals("x (outer scope) is: 10 y (current scope) is: 11", ScopeDemo.blockScope(10));
    }

    @Test
    void variablesLiveInScope() {
        String expected = " y is: 1 y is now: 100 y is: 1 y is now: 100";
        assertEquals(expected, ScopeDemo.varInitDemo());
    }
}