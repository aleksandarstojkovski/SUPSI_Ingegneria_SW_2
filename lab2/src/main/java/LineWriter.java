import java.io.PrintStream;

public abstract class LineWriter {

        private final ManipulationStrategy manipulator;
        private final PrintStream stream;
        private final MyList currentList;

        public LineWriter(PrintStream stream, ManipulationStrategy manStrat, MyList list){
                this.manipulator = manStrat;
                this.stream = stream;
                this.currentList = list;
        }

        public void printOneLine(String line){
        stream.println(manipulator.manipulation(line));
        }

        public void printAllLines(){
                MyIterator<String> currentIterator = getIterator(currentList);
                while (currentIterator.hasMoreElements()){
                        this.printOneLine(currentIterator.nextElement());
                }
        }

        abstract MyIterator getIterator(MyList currentList);

}