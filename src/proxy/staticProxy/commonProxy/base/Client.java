package proxy.staticProxy.commonProxy.base;

//普通代理实现
public class Client {
    public static void main(String[] args){
        Subject realSubject = new RealSubject();
        Subject proxySubject = new Proxy(realSubject);
        proxySubject.doSomeThing();
    }
}
