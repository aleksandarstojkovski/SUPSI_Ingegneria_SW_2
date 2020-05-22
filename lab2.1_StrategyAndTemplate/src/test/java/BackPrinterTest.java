import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class BackPrinterTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    void printData() throws IOException {
        InputStream in = BackPrinterTest.class.getResourceAsStream("text.txt");
        BackPrinter printer = new BackPrinter(in);
        var list =  printer.loadData();
        PrintStream stream = new PrintStream(outContent);
        printer.printData(list, stream);

        String result = "CCC" + System.lineSeparator() +
                "BBB" + System.lineSeparator() +
                "AAA" + System.lineSeparator();
        assertNotEquals(outContent.toString(), result);
    }

    @Test
    void loadData() {
        assertThrows(FileNotFoundException.class, () -> new BackPrinter("path_not_existing"));
    }

}