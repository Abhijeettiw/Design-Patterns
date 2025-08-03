public class Poolable {
    private final String id;

    public Poolable(String id) {
        this.id = id;
        System.out.println("Created resource: " + id);
    }

    public void use() {
        System.out.println("Using resource: " + id);
    }

    public String getId() {
        return id;
    }

}
