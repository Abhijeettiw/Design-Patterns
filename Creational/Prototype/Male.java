public class Male extends Human {

    private String type;

    @Override
    protected void subClassImpl() {
        type = "Male";
    }

    //    Override clone method when cloning is not allowed else no need to override clone
//    @Override
//    public Human clone() throws CloneNotSupportedException {
//        throw new CloneNotSupportedException("Cannot Clone");
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
