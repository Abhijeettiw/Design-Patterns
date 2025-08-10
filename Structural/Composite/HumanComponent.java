import java.util.List;

public abstract class HumanComponent {
    private String name;

    HumanComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void addHuman(HumanComponent component);

    public abstract void deleteHuman(HumanComponent component);

    public abstract List<HumanComponent> getAllHumanComponents();
    public abstract void getAllHumanComponentsName();
}