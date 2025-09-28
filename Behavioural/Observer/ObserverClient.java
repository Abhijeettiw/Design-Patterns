public class ObserverClient {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer firstObserver = new FirstConcreteObserver("First Observer");
        Observer secondObserver = new FirstConcreteObserver("Second Observer");
        Observer thirdObserver = new SecondConcreteObserver("Third Observer");
        subject.setState("First");
        subject.attach(firstObserver);
        subject.attach(secondObserver);
        subject.attach(thirdObserver);
        subject.notifyObservers();
        subject.setState("Second");
        subject.notifyObservers();
    }
}
