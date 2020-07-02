import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WorkerTest {

    @Test
    void conversion() {
        assertEquals(2, Worker.conversion(4));
        assertEquals(10, Worker.conversion(3));
    }

    @Test
    void sequence() {
        assertThrows(IllegalArgumentException.class, () -> new Worker(1).sequence());
        assertEquals(6, new Worker(10).sequence());
    }
}