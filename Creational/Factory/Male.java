public class Male extends Human{
    Male(){
        super();
        this.setType("Male");
    }
    @Override
    public Human getHuman(String type) {
        return new Male();
    }
}
