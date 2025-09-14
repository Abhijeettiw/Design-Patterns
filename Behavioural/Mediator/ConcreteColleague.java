public class ConcreteColleague extends Colleague {
    @Override
    void send(String message) {
        System.out.println(name+" sent -> " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    void receive(String message) {
        System.out.println(name+" receive -> " + message);
    }

    ConcreteColleague(Mediator mediator, String name) {
        super(mediator, name);
    }
}
