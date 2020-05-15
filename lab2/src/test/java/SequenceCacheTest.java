import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenceCacheTest {
    SequenceCache testSequenceCache = new SequenceCache();
    @Test
    void sequence() {
        assertEquals(6,testSequenceCache.lenght(10));
        assertEquals(6,testSequenceCache.lenght(10));
        // trovato un errore attraverso questo secondo test all'interno di Worker.sequence()
        assertEquals(7,testSequenceCache.lenght(20));
    }
}