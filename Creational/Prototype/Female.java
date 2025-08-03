public class Female extends Human {
    private String type;

    @Override
    protected void subClassImpl() {
        type = "Female";
    }
//
//    Female(){
//        super();
//        this.setSpecies("Homo Sapiens / Female");
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
