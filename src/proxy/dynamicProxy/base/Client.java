package proxy.dynamicProxy.base;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//基本的动态代理实现
public class Client {
   public static void main(String[] args){
       Subject realSubject = new RealSubject();
       InvocationHandler invocationHandler = new SubjectProxy(realSubject);
       ClassLoader cl = realSubject.getClass().getClassLoader();
       Subject proxy = (Subject) Proxy.newProxyInstance(cl,new Class[]{SubjectProxy.class},invocationHandler);
       proxy.doSomeThing();
   }
}
