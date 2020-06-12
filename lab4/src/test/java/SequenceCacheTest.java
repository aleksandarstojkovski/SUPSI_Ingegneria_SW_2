import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.util.Map;

import static org.mockito.Mockito.*;

class SequenceCacheTest {

    @Test
    void test1() {

        Map<Integer, Worker> cache = Mockito.mock(Map.class);
        SequenceCache sequenceCache = new SequenceCache(cache);

        when(cache.get(6)).thenReturn(new Worker(6));
        when(cache.containsKey(6)).thenReturn(false).thenReturn(true);
        sequenceCache.length(6);
        verify(cache,times(1)).put(anyInt(),anyObject());

    }

}