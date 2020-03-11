import java.util.HashMap;
import java.util.Map;

public class SequenceCache {

    Map<Integer,Worker> map = new HashMap();

    public int length (int n){
        Worker w;
        if (map.containsKey(n)){
            w = map.get(n);
        } else{
            w = new Worker(n);
            map.put(n,w);
        }
        return w.sequence();
    }

}
