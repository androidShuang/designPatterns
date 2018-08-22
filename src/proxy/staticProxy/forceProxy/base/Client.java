package proxy.staticProxy.forceProxy.base;

//强制代理类，只能通过真实角色指定的代理类才能调用
public class Client {
    public static void main(String[] args){
        //直接调用真实角色,失败
        Subject realSubject = new RealSubject();
        realSubject.doSomeThing();


        //自己创建一个代理类,失败
        Subject realSubject1 = new RealSubject();
        Subject proxySubject1 = new Proxy(realSubject1);
        proxySubject1.doSomeThing();

        //通过真实角色制定的代理类,成功
        Subject reaSubject2 = new RealSubject();
        Subject proxySubject2 = reaSubject2.getProxy();
        proxySubject2.doSomeThing();

    }
}
