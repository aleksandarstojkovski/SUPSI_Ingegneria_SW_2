import java.util.ArrayList;

public class MyList<T> {

    private final ArrayList<T> myArrayList;

    MyList(){
        myArrayList = new ArrayList<T>();
    }

    void addElement(T ob){
        myArrayList.add(ob);
    }

    public int length(){
        return myArrayList.size();
    }

    public T getElement(int pos){
        return myArrayList.get(pos);
    }

    MyIterator<T> getForwardIterator(){
        return new ForwardIterator<>(this);
    }

    MyIterator<T> getBackwardIterator(){
        return new BackwardIterator<>(this);
    }

}


