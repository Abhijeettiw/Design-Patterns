public class UnsharedConcreteFlyweight extends FlyweightFactory {
    @Override
    public String errorMessage(Integer type) {
        return switch (type) {
            case 1 -> "501";
            case 2 -> "502";
            case 3 -> "503";
            case 4 -> "504";
            default -> "500";
        };
    }
}
