public class BackwardIterator<T> implements MyIterator<T> {

    private final MyList<T> myList;
    private int position;

    public BackwardIterator(MyList<T> ob){
        this.myList=ob;
        rewind();
    }

    @Override
    public void rewind() {
        position=myList.length()-1;
    }

    @Override
    public T nextElement() {
        T currentElement = myList.getElement(position);
        position--;
        return currentElement;
    }

    @Override
    public boolean hasMoreElements() {
        return position>=0;
    }

}
