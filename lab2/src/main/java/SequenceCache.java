import java.util.HashMap;
import java.util.Map;

public class SequenceCache {
    private Map<Integer,Worker> workerCache;
    public Map<Integer, Worker> getWorkerCache() {
        return workerCache;
    }
    public SequenceCache() {
        this.workerCache = new HashMap<Integer,Worker>();
    }
    public int lenght(int startingValue){
        if(workerCache.containsKey(startingValue)){
            return workerCache.get(startingValue).sequence();
        } else {
            Worker tempWorker = new Worker(startingValue);
            this.workerCache.put(startingValue,tempWorker);
            return tempWorker.sequence();
        }
    }
}
