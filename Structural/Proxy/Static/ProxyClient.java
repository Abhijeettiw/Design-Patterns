package Static;

public class ProxyClient {
    public static void main(String[] args) {
        System.out.println(ObjectFactory.getResourceObject(1));
        System.out.println(ObjectFactory.getResourceObject(2));
    }
}
