package proxy.dynamicProxy.better;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler invocationHandler){
        if(true){
            new BeforeAdvice().exec();
        }
        return (T) Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
    }
}
