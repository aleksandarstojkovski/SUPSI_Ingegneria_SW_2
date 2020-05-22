import java.io.PrintStream;

public class LineForwardWriter implements LineWriter {

    private final ManipulationStrategy manipulator;
    private final PrintStream stream;
    private final MyList currentList;

    public LineForwardWriter(PrintStream stream, ManipulationStrategy manStrat, MyList list) {
        this.manipulator = manStrat;
        this.stream = stream;
        this.currentList = list;
    }

    private void printOneLine(String line){
        stream.println(manipulator.manipulation(line));
    }

    @Override
    public void printAllLines(){
        MyIterator<String> currentIterator = getIterator();
        while (currentIterator.hasMoreElements()){
            this.printOneLine(currentIterator.nextElement());
        }
    }
    @Override
    public MyIterator getIterator() {
        return currentList.getBackwardIterator();
    }


}
