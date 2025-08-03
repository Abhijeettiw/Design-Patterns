public class Client {
    public static void main(String[] args) {
        ObjectPoolImpl pool = new ObjectPoolImpl();

        Poolable r1 = pool.acquire();
        r1.use();

        Poolable r2 = pool.acquire();
        r2.use();

        pool.release(r1); // Releasing r1 back to pool

        Poolable r3 = pool.acquire(); // Reuses r1
        r3.use();
    }
}
