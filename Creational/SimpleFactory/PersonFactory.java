public class PersonFactory {
    public static Person createPerson(String country){
        return switch (country) {
            case "Indian" -> new PersonIndian();
            case "Bhutan" -> new PersonBhutan();
            default -> throw new RuntimeException("Nationality Not Defined");
        };
    }
}
