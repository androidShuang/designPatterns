package proxy.staticProxy.commonProxy.base;

public class Proxy implements Subject{
    private Subject subject = null;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void doSomeThing() {
        this.before();
        this.subject.doSomeThing();
        this.before();
    }
    //前置处理
    public void before(){

    }
    //后续处理
    public void after(){

    }
}
