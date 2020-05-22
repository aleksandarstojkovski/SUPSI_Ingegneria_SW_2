public class LineWriterDecorator implements LineWriter {

    private final LineWriter selectedLineWriter;

    public LineWriterDecorator(LineWriter selectedLineWriter) {
        this.selectedLineWriter = selectedLineWriter;
    }

    @Override
    public void printAllLines() {
        selectedLineWriter.printAllLines();
    }

    @Override
    public MyIterator getIterator(){
        return selectedLineWriter.getIterator();
    }

}
