public abstract class Observer {
    protected String name;
    Observer(String name){
        this.name = name;
    }
    abstract void update(String subject);

    public String getName() {
        return name;
    }
}
