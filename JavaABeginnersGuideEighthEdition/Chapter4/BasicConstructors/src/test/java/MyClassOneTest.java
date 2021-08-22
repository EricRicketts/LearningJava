import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassOneTest {

    @Test
    void noParameterizedConstructor() {
        MyClassOne myObj = new MyClassOne();
        assertEquals(10, myObj.x);
    }

}