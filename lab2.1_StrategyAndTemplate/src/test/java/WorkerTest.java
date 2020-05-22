import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorkerTest {

    Worker myWorker = new Worker(10);

    @Test
    void conversion() {
        assertEquals(10, myWorker.conversion(20));
        assertEquals(34, myWorker.conversion(11));
    }

    @Test
    void sequence() {
        assertEquals(6,myWorker.sequence());
    }

}