package adapter.base;

public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        super.doSomeThing();
    }
}
