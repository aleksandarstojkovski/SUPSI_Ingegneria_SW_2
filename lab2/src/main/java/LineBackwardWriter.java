import java.io.PrintStream;

public class LineBackwardWriter extends LineWriter {

    public LineBackwardWriter(PrintStream stream, ManipulationStrategy manStrat, MyList list) {
        super(stream, manStrat, list);
    }

    @Override
    MyIterator getIterator(MyList currentList) {
        return currentList.getBackwardIterator();
    }

}
