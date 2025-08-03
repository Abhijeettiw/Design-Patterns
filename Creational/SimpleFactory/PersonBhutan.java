public class PersonBhutan extends Person {
    public String getBhutan(){
        return "Bhutan";
    }
    PersonBhutan(){
        super();
        this.setNationality(getBhutan());
    }

}
