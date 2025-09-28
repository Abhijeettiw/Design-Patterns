public class Context {
    private State state;
    Context(){
        this.state = new ConcreteStateStart();
    }
    void printState(){
        state.printCurrentState();
    }
//    public void start(){
//        state = new ConcreteStateStart();
//    }
    public void inProgress(){
        state = new ConcreteStateInProgress();
    }
    public void finish(){
        state = new ConcreteStateFinish();
    }
}
