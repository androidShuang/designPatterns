package proxy.dynamicProxy.better;

import java.lang.reflect.InvocationHandler;

public class Client {
    public static void main(String[] args){
        Subject realSubject  = new RealSubject();
        InvocationHandler invocationHandler = new MyInviocationHandler(realSubject);
        ClassLoader cl = realSubject.getClass().getClassLoader();
        Subject proxy = DynamicProxy.newProxyInstance(cl,realSubject.getClass().getInterfaces(),invocationHandler);
        proxy.doSomeThing();
    }
}
