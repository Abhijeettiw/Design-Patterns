package Dynamic;

public class DynamicProxyClient {
    public static void main(String[] args) {
        DynamicResourceFactory resource = DynamicObjectProxy.getResource();
        System.out.println(resource.getResource());
    }
}
