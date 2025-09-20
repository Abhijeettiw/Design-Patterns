public class ConcreteAggregate extends Aggregate {
    @Override
    ConcreteIterator getIterator() {
        return new ConcreteIterator();
    }
}
