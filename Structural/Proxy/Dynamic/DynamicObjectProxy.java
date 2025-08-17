package Dynamic;

import java.lang.reflect.Proxy;

public class DynamicObjectProxy {
    public static DynamicResourceFactory getResource(){
        return (DynamicResourceFactory) Proxy.newProxyInstance(DynamicObjectProxy.class.getClassLoader(),new Class[]{DynamicResourceFactory.class},new ResourceInvocationHandler());
    }
}
