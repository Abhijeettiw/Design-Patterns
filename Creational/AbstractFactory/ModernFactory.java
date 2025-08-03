public class ModernFactory implements ResourceFactory {
    @Override
    public Animals createAnimal() {
        return new ModernAnimals();
    }

    @Override
    public Humans createHuman() {
        return new ModernHumans();
    }
}
