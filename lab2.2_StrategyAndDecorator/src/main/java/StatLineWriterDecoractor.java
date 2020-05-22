public class StatLineWriterDecoractor extends LineWriterDecorator {

    private final char character;

    public StatLineWriterDecoractor(LineWriter selectedLineWriter,char character) {
        super(selectedLineWriter);
        this.character = character;
    }

    @Override
    public void printAllLines() {
        super.printAllLines();
        printStatistics();
    }

    private void printStatistics(){
        MyIterator<String> currentIterator = super.getIterator();
        int count = 0;
        do{
            String currentElement = currentIterator.nextElement();
            for(int i=0; i < currentElement.length(); i++)
            {
                if(currentElement.charAt(i) == character)
                    count++;
            }
        }while(currentIterator.hasMoreElements());
        System.out.println("\nThe character "+this.character+" appears "+count+" times");
    }

}