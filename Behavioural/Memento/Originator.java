public class Originator {
    private String text;

    public Memento getMemento() {
        System.out.println(text);
        return new Memento(text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void undo(Memento memento) {
        this.text = memento.getState();
        System.out.println(text);
    }
}
