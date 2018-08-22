package proxy.staticProxy.forceProxy.extension;

public class Proxy implements Subject,OtherInterface {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void doSomeThing() {
        this.subject.doSomeThing();
        this.another();
    }

    @Override
    public Subject getProxy() {
        return this;
    }

    @Override
    public void another() {

    }
}
