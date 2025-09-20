public class ConcreteIterator extends Iterator<Target> {

    private int position;
    @Override
    Boolean hasNext() {
        return position<Target.color.size();
    }

    @Override
    Object next() {
        return Target.color.get(position++);
    }
}
