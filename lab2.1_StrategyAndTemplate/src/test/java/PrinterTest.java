import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    void printData() throws IOException {
        InputStream in = PrinterTest.class.getResourceAsStream("text.txt");
        Printer printer = new Printer(in);
        var list =  printer.loadData();
        PrintStream stream = new PrintStream(outContent);
        printer.printData(new LineForwardWriter(System.out,new DoNothingStrategy(),list));

        String result = "CCC" + System.lineSeparator() +
                "BBB" + System.lineSeparator() +
                "AAA" + System.lineSeparator();
        assertNotEquals(outContent.toString(), result);
    }

    @Test
    void loadData() {
        assertThrows(NullPointerException.class, () -> new Printer("path_not_existing"));
    }

}