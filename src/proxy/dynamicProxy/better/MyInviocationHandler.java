package proxy.dynamicProxy.better;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInviocationHandler implements InvocationHandler{
    private Object target = null;

    public MyInviocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target,args);
    }
}