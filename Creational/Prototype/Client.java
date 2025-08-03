public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Male male = new Male();
        male.initialize();
        System.out.println(male.getType());
        Male maleClone = (Male) male.clone();
        System.out.println(maleClone.getType());
        Female female = new Female();
        System.out.println(female.getType());
        Female femClone = (Female) female.clone();
        System.out.println(femClone.getType());
    }
}
