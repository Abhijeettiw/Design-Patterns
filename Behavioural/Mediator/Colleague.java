public abstract class Colleague {
    protected Mediator mediator;
    protected String name;

    abstract void send(String message);

    abstract void receive(String message);
    Colleague(Mediator mediator,String name){
        this.mediator = mediator;
        this.name = name;
    }
}
