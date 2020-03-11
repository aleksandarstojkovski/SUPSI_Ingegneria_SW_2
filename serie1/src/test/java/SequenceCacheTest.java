import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class SequenceCacheTest {

    @Test
    public void length(){
      SequenceCache sq = new SequenceCache();
      assertEquals(6, sq.length(10));
    }

}
