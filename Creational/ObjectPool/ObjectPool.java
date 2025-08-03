public interface ObjectPool <T extends Object>{
    public Poolable acquire();
    public void release(T resource);
}
