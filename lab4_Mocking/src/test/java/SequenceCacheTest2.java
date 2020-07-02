import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Map;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SequenceCacheTest2 {

    @Mock
    private Map<Integer, Worker> cacheMock;

    @InjectMocks
    private SequenceCache sequenceCache;

    @Test
    public void testCache(){
        when(cacheMock.get(6)).thenReturn(new Worker(6));
        when(cacheMock.containsKey(6)).thenReturn(false).thenReturn(true);
        sequenceCache.length(6);
        Mockito.verify(cacheMock, Mockito.times(1)).put(Mockito.anyInt(),Mockito.anyObject());
    }

}