package proxy.dynamicProxy.better;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//优化
public class SubjectDynamicProxy extends DynamicProxy{
    public static <T> T newProxyInstance(Subject subject){
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?>[] classes = subject.getClass().getInterfaces();
        InvocationHandler invocationHandler = new MyInviocationHandler(subject);
        return newProxyInstance(classLoader,classes,invocationHandler);
    }
}
