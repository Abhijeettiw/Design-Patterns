public class SecondConcreteObserver extends Observer {
    SecondConcreteObserver(String name) {
        super(name);
    }

    @Override
    public void update(String subject) {
        System.out.println(name);
        System.out.println("State changed to -> "+subject);
    }
}
