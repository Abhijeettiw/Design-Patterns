public class FirstConcreteObserver extends Observer {
    FirstConcreteObserver(String name) {
        super(name);
    }

    @Override
    public void update(String subject) {
        System.out.println(name);
        System.out.println("State changed to -> "+subject);
    }
}
