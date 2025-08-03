public class Client {
    public static void main(String[] args) {
        MaleCreator male = new MaleCreator();
        System.out.println(male.getHuman().getType());
        FemaleCreator female = new FemaleCreator();
        System.out.println(female.getHuman().getType());
    }
}
