package Static;

public class ObjectProxy extends Resource {
    @Override
    public String getResource(Integer num) {
        Object object = new Object();
        return switch (num) {
            case 1 -> object.getResource(num);
            case 2 -> "Identity Unknown";
            default -> "Un-Authorized";
        };
    }
}
