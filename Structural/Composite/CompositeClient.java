public class CompositeClient {
    public static void main(String[] args) {
        HumanComponent h1 = new HumanLeaf("Component 1","Comp 1 desc");
        HumanComposite composite1 = new HumanComposite("Composite 1");
        composite1.addHuman(h1);
        HumanComponent h2 = new HumanLeaf("Component 2","Comp 2 desc");
        HumanComponent h3 = new HumanLeaf("Component 3","Comp 3 desc");
        HumanComponent h4 = new HumanLeaf("Component 4","Comp 4 desc");
        HumanComposite composite2 = new HumanComposite("Composite 2");
        composite2.addHuman(h2);
        composite2.addHuman(h3);
        composite2.addHuman(h4);
        composite2.addHuman(composite1);
        composite2.getAllHumanComponentsName();
        composite1.getAllHumanComponentsName();
    }
}
