import java.io.PrintStream;

public class LineForwardWriter extends LineWriter{

    public LineForwardWriter(PrintStream stream, ManipulationStrategy manStrat, MyList list) {
        super(stream, manStrat, list);
    }

    @Override
    protected MyIterator getIterator(MyList currentList) {
        return currentList.getForwardIterator();
    }

}
