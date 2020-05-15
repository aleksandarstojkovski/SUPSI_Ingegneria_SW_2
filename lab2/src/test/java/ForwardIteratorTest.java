import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForwardIteratorTest {
    @Test
    void rewind() {
        MyList<String> testList = new MyList<String>();
        testList.addElement("0");
        testList.addElement("1");
        testList.addElement("2");
        MyIterator<String> testIterator = testList.getForwardIterator();
        String bufferedString;
        do{
            bufferedString = testIterator.nextElement();
        }while(bufferedString.equals("2"));
        testIterator.rewind();
        assertEquals("0",testIterator.nextElement());
    }

    @Test
    void nextElement() {
        MyList<String> testList = new MyList<String>();
        testList.addElement("0");
        testList.addElement("1");
        MyIterator<String> testIterator = testList.getForwardIterator();
        assertEquals("0",testIterator.nextElement());
    }

    @Test
    void hasMoreElements() {
        MyList<String> testList = new MyList<String>();
        assertEquals(false,testList.getForwardIterator().hasMoreElements());
    }
}