public class NullObjectClient {
    public static void main(String[] args) {
        AbstractClass concreteClass = new ConcreteClass();
        concreteClass.operations();
        AbstractClass nullObjectClass = new NullClass();
        nullObjectClass.operations();
    }
}
