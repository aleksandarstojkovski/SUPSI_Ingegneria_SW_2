public class ForwardIterator<T> implements MyIterator<T> {
    private MyList<T> myList;
    int position;
    ForwardIterator(MyList<T> ob){
        this.myList=ob;
        position = 0;
    }

    @Override
    public void rewind() {
        position = 0;
    }

    @Override
    public T nextElement() {
        T currentElement = myList.getElement(position);
        position++;
        return currentElement;
    }

    @Override
    public boolean hasMoreElements() {
        int lastPosition = myList.length()-1;
        if (position<lastPosition){
            return true;
        } else{
            return false;
        }
    }
}
