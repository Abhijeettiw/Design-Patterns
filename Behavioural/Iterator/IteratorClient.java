public class IteratorClient {
    public static void main(String[] args) {
        ConcreteIterator iterator = new ConcreteAggregate().getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
