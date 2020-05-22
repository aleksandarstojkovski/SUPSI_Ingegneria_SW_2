
import java.io.*;

public class BackPrinter {

    private final Reader reader;

    BackPrinter(String path) throws FileNotFoundException {
        reader = new FileReader(path);
    }

    BackPrinter(InputStream in) {
        // usato nei test, dove non si legge un file, ma si genera un input stream
        reader = new InputStreamReader(in);
    }

    public static void main(String[] args) throws IOException {
        BackPrinter printer = new BackPrinter("test.txt");
        var list = printer.loadData();
        printer.printData(list, System.out);
    }

    void printData(MyList<String> myList, PrintStream stream) {
        MyIterator<String> myIterator = myList.getBackwardIterator();
        while(myIterator.hasMoreElements())
            stream.println(myIterator.nextElement());
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
