import java.util.Stack;

public class CareTaker {
    private Stack<Memento> data = new Stack<>();

    void save(Memento memento) {
        data.add(memento);
    }

    Memento undo() {
        if (!data.isEmpty()) return data.pop();
        else return null;
    }
}
