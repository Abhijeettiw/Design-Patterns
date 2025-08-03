public class MaleCreator extends HumanCreator{
    @Override
    public Human getHuman() {
        return new Male();
    }
}
