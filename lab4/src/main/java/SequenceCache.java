import java.util.HashMap;
import java.util.Map;

public class SequenceCache {

    private Map<Integer, Worker> cache;

    public int length(int value){
        if(!cache.containsKey(value))
            cache.put(value, createWorker(value));

        Worker worker = cache.get(value);
        return worker.sequence();
    }

    public SequenceCache(Map<Integer, Worker> cache){
        this.cache = cache;
    }

    public Worker createWorker(int value){
        return new Worker(value);
    }

}
