package proxy.staticProxy.commonProxy.extension;

//静态普通代理的扩展，只能调用代理类，不用直接使用真实类
public class Client {
    public static void main(String[] args){
        Subject proxySubject = new Proxy();
        proxySubject.doSomeThing();
    }
}
