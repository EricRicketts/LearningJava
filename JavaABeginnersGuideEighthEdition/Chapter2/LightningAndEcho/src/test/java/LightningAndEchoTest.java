import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightningAndEchoTest {

    @Test
    void lightningDistance() {
        assertEquals(7920.0, LightningAndEcho.lightningDistance(7.2));
    }

    @Test
    void echo() {
        assertEquals(3960.0, LightningAndEcho.echo(7.2));
    }
}