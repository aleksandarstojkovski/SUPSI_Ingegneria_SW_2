import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackwardIteratorTest {

    @Test
    void rewind() {
        MyList<String> testList = new MyList<String>();
        testList.addElement("0");
        testList.addElement("1");
        testList.addElement("2");
        MyIterator<String> testIterator = testList.getBackwardIterator();
        String bufferedString;
        do{
            bufferedString = testIterator.nextElement();
        }while(bufferedString.equals("0"));
        testIterator.rewind();
        assertEquals("2",testIterator.nextElement());
    }

    @Test
    void nextElement() {
        MyList<String> testList = new MyList<String>();
        testList.addElement("0");
        testList.addElement("1");
        MyIterator<String> testIterator = testList.getBackwardIterator();
        assertEquals("1",testIterator.nextElement());
    }

    @Test
    void hasMoreElements() {
        MyList<String> testList = new MyList<String>();
        assertEquals(false,testList.getBackwardIterator().hasMoreElements());
    }

}