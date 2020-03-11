import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class WorkerTest {

    int evenNumber;
    int oddNumber;
    Worker tenNumberWorker;
    Worker threeNumberWorker;

    @Before
    public void initClass(){
//        evenNumber=2;
//        oddNumber=3;
        tenNumberWorker = new Worker(10);
        threeNumberWorker = new Worker(3);
    }

//    @Test
//    public void testConversion(){
//        assertEquals(Worker.conversion(evenNumber),1);
//        assertEquals(Worker.conversion(oddNumber),10);
//    }

//    @Test
//    public void testSequence(){
//        assertEquals(Worker.sequence(8),3);
//        assertEquals(Worker.sequence(3),7);
//    }

    @Test
    public void testConversion(){
        assertEquals(tenNumberWorker.sequence(), 6);
        assertEquals(threeNumberWorker.sequence(), 7);
    }


}
