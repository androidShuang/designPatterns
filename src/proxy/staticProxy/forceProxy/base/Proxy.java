package proxy.staticProxy.forceProxy.base;

public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void doSomeThing() {
        this.subject.doSomeThing();
    }

    @Override
    public Subject getProxy() {
        return this;
    }
}
