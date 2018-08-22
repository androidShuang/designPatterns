package proxy.dynamicProxy.better;

//优化后的方便使用的
public class ClientBetter {
    public static void main(String[] args){
        Subject realSubject = new RealSubject();
        Subject proxy = SubjectDynamicProxy.newProxyInstance(realSubject);
        proxy.doSomeThing();
    }
}
