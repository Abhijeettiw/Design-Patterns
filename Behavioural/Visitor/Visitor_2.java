public class Visitor_2 implements Visitor{
    @Override
    public void visit(Element_1 element1) {
        element1.accept(this);
    }

    @Override
    public void visit(Element_2 element2) {
        element2.accept(this);
    }
}
