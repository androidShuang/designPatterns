package proxy.staticProxy.forceProxy.base;

public class RealSubject implements Subject{

    private Subject proxy;

    @Override
    public void doSomeThing() {
        if(isProxy()){
            //dosomeThing
        }else{
            System.out.println("请使用代理类访问");
        }
    }

    public Subject getProxy(){
        proxy = new Proxy(this);
        return proxy;
    }

    private boolean isProxy(){
        if(proxy==null){
            return false;
        }else{
            return true;
        }
    }

}
