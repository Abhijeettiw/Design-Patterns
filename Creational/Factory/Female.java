public class Female extends Human{
    Female(){
        this.setType("Female");
    }
    @Override
    public Human getHuman(String type) {
        return new Female();
    }
}
