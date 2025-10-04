public class Element_2 implements Element {
    @Override
    public void accept(Visitor visitor) {
        operation(visitor);
    }

    @Override
    public void operation(Visitor visitor) {
        System.out.println(visitor.getClass().getName());
    }
}
