import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private String state;
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        boolean b = observerList.stream().anyMatch(o -> o.getName().equalsIgnoreCase(observer.getName()));
        if(!b) observerList.add(observer);
        else System.out.println("Observer "+observer.getName()+" already present");
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(o-> o.update(state));
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
