import java.util.ArrayList;
import java.util.List;

public class ObjectPoolImpl implements ObjectPool<Poolable> {
    private final List<Poolable> available = new ArrayList<>();
    private final List<Poolable> inUse = new ArrayList<>();
    private int counter = 0;
    private final int MAX_RESOURCES = 5;

    public Poolable acquire() {
        if (available.isEmpty() && inUse.size() < MAX_RESOURCES) {
            Poolable resource = new Poolable("ID:"+ ++counter);
            inUse.add(resource);
            return resource;
        } else if (!available.isEmpty()) {
            Poolable resource = available.removeFirst();
            inUse.add(resource);
            return resource;
        } else {
            throw new RuntimeException("No resources available.");
        }
    }

    public void release(Poolable resource) {
        inUse.remove(resource);
        available.add(resource);
    }
}
