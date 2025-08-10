import java.util.LinkedList;
import java.util.List;

public class HumanComposite extends HumanComponent {
    List<HumanComponent> children = new LinkedList<>();

    HumanComposite(String name) {
        super(name);
    }

    @Override
    public void addHuman(HumanComponent component) {
        children.add(component);

    }

    @Override
    public void deleteHuman(HumanComponent component) {
        children.remove(component);
    }

    @Override
    public List<HumanComponent> getAllHumanComponents() {
        return children;
    }

    @Override
    public void getAllHumanComponentsName() {
        children.stream().map(HumanComponent::getName).forEach(System.out::println);
    }
}
