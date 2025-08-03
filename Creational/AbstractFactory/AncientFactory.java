public class AncientFactory implements ResourceFactory {
    @Override
    public Animals createAnimal() {
        return new AncientAnimals();
    }

    @Override
    public Humans createHuman() {
        return new AncientHumans();
    }
}
