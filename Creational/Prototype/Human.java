public abstract class Human implements Cloneable {

    private String species;

    @Override
    public Human clone() throws CloneNotSupportedException {
        Human human = (Human) super.clone(); // For Shallow copy
        human.initialize();
        return human;
    }

    public void initialize() {
        this.species = "Homo Sapiens";
        subClassImpl();
    }

    protected abstract void subClassImpl();

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
