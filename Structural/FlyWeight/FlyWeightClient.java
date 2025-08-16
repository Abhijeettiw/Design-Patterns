public class FlyWeightClient {
    public static void main(String[] args) {
        Flyweight fw1 = new Flyweight(1);
        System.out.println(fw1.getMessage()+" "+fw1.getErrorCode());
        Flyweight fw2 = new Flyweight(2);
        System.out.println(fw2.getMessage()+" "+fw2.getErrorCode());
    }
}
