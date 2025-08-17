package Dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ResourceInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Method getResource = DynamicResourceFactory.class.getDeclaredMethod("getResource");
        if(getResource.equals(method))
            return new DynamicObject().getResource();
        else return null;
    }
}
