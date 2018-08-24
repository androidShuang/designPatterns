package chainOfResponsibility;

public class ConcreteHandler1 extends Handler{
    @Override
    protected Level getLevel() {
        return new Level(1);
    }

    @Override
    protected Response echo(Request request) {
        return null;
    }
}
