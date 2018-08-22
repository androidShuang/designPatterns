package proxy.staticProxy.commonProxy.extension;

public class Proxy implements Subject {
    private Subject subject = null;

    public Proxy() {
        try {
            this.subject = new RealSubject(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
