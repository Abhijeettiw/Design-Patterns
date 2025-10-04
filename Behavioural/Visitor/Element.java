public interface Element {
    void accept(Visitor visitor);
    void operation(Visitor visitor);
}
