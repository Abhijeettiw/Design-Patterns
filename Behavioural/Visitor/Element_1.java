public class Element_1 implements Element {
    @Override
    public void accept(Visitor visitor) {
        operation(visitor);
    }

    @Override
    public void operation(Visitor visitor) {
        System.out.println(visitor.getClass().getName());
    }
}
