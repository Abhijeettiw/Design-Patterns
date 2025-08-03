public class LazyInitializationHolder {
    private LazyInitializationHolder() {
    }

    private static class InitializationHolder {
        static LazyInitializationHolder INSTANCE = new LazyInitializationHolder();
    }

    public static LazyInitializationHolder getInstance() {
        return InitializationHolder.INSTANCE;
    }
}
