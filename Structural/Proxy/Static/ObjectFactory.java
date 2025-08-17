package Static;

public class ObjectFactory {
    public static String getResourceObject(Integer num){
        Resource resource = new ObjectProxy();
        return resource.getResource(num);
    }
}
