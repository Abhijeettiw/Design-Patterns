public class PersonIndian extends Person{
    private String ame;

    PersonIndian(){
        super();
        this.setNationality(getIndian());
    }



    public String getIndian() {
        return "Indian";
    }
}

