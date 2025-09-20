public class IteratorClient {
    public static void main(String[] args) {
        ConcreteIterator iterator = new ConcreteAggregate().getIterator();
//        Iterator<Target> iterator = new ConcreteIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
