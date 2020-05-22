import java.io.*;

public class Printer {

    private final Reader reader;

    Printer(String path) throws FileNotFoundException {
        reader = new FileReader(getClass().getResource(path).getFile());
    }

    Printer(InputStream in) {
        // usato nei test, dove non si legge un file, ma si genera un input stream
        reader = new InputStreamReader(in);
    }

    public static void main(String[] args) throws IOException {
        Printer printer = new Printer("text.txt");
        String outputFileName = "text.txt.copy";
        PrintWriter fileOut = new PrintWriter(new FileWriter(outputFileName));
        var list = printer.loadData();
        System.out.println("\nPrint forward with DoNothingStrategy and Stats");
        printer.printData(new StatLineWriterDecoractor(new LineForwardWriter(System.out,new DoNothingStrategy(),list),'a'));
        System.out.println("\nPrint backward with UpperCaseStrategy and Stats");
        printer.printData(new StatLineWriterDecoractor(new LineBackwardWriter(System.out, new UpperCaseStrategy(),list),'a'));
    }


    void printData(LineWriter currentLineWriter) {
        currentLineWriter.printAllLines();
    }


    MyList<String> loadData() throws IOException {
        MyList<String> myList = new MyList<>();
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();
        while(line != null) {
            myList.addElement(line);
            line = bufferedReader.readLine();
        }
        return myList;
    }
}
