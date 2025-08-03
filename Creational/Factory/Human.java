public abstract class Human {
    private String type;
    public abstract Human getHuman(String type);

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
