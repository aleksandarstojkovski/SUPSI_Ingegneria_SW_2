import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
class SequenceCacheTest {

    @Mock
    private SequenceCache sequenceCacheMock;

    @InjectMocks
    private Map<Integer, Worker> cache = new HashMap<>();

    @Test
    void length() {
        SequenceCache cache = new SequenceCache();
        assertEquals(6, cache.length(10));
        assertEquals(6, cache.length(10));
    }

    @Test
    void testCache(){
        sequenceCacheMock.length(10);
        Mockito.verify(cache, Mockito.times(1)).put(Mockito.anyInt(),Mockito.anyObject());
    }

}