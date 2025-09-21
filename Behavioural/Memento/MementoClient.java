public class MementoClient {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setText("Starting");
        careTaker.save(originator.getMemento());
        originator.setText("Started");
        careTaker.save(originator.getMemento());
        originator.setText("Working");
        careTaker.save(originator.getMemento());
        originator.setText("End");
        careTaker.save(originator.getMemento());
        originator.undo(careTaker.undo());
        originator.undo(careTaker.undo());
        originator.undo(careTaker.undo());
        originator.undo(careTaker.undo());
    }
}
