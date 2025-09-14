public class MediatorClient {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleague_1 = new ConcreteColleague(mediator,"A");
        Colleague colleague_2 = new ConcreteColleague(mediator,"B");
        Colleague colleague_3 = new ConcreteColleague(mediator,"C");
        mediator.addColleague(colleague_1);
        mediator.addColleague(colleague_2);
        mediator.addColleague(colleague_3);

        colleague_1.send("Hello");
        colleague_2.send("Hi");
    }
}
