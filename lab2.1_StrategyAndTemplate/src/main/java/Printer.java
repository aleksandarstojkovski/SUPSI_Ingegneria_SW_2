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
        FileWriter fileOut = new FileWriter(outputFileName);

        FileOutputStream fout=new FileOutputStream(outputFileName);
        PrintStream pout = new PrintStream(fout);

        var list = printer.loadData();
        System.out.println("Print forward with DoNothingStrategy");
        printer.printData(new LineForwardWriter(System.out,new DoNothingStrategy(),list));
        System.out.println("Print backward with UpperCaseStrategy");
        printer.printData(new LineBackwardWriter(System.out, new UpperCaseStrategy(),list));
        System.out.println("\nPrint forward with DoNothingStrategy on file");
        printer.printData(new LineForwardWriter(pout,new DoNothingStrategy(),list));
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
