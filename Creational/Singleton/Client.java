public class Client {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton_1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton_2 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton_1 == eagerSingleton_2);

        LazySingleton lazySingleton_1 = LazySingleton.getInstance();
        LazySingleton lazySingleton_2 = LazySingleton.getInstance();
        System.out.println(lazySingleton_1 == lazySingleton_2);

        LazyInitializationHolder lazyInitializationHolder_1 = LazyInitializationHolder.getInstance();
        LazyInitializationHolder lazyInitializationHolder_2 = LazyInitializationHolder.getInstance();
        System.out.println(lazyInitializationHolder_1 == lazyInitializationHolder_2);

    }
}
