import java.util.List;

public class HumanLeaf extends HumanComponent {
    private String desc;

    HumanLeaf(String name, String desc) {
        super(name);
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public void addHuman(HumanComponent component) {
        //        Child Management Operations
        throw new UnsupportedOperationException("Do not support this operation");
    }

    @Override
    public void deleteHuman(HumanComponent component) {
        //        Child Management Operations
        throw new UnsupportedOperationException("Do not support this operation");
    }

    @Override
    public List<HumanComponent> getAllHumanComponents() {
        //        Child Management Operations
        throw new UnsupportedOperationException("Do not support this operation");
    }

    @Override
    public void getAllHumanComponentsName() {
        //        Child Management Operations
        throw new UnsupportedOperationException("Do not support this operation");
    }
}