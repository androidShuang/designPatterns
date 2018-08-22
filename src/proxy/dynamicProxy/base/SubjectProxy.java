package proxy.dynamicProxy.base;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectProxy implements InvocationHandler{

    Class cls;
    Object object;

    public SubjectProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(this.object,args);
        //做一些后置操作
        if(method.getName().equalsIgnoreCase("some")){
            //dosomething
        }
        return result;
    }
}
