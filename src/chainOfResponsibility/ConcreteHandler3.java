package chainOfResponsibility;

public class ConcreteHandler3 extends Handler{
    @Override
    protected Level getLevel() {
        return new Level(3);
    }

    @Override
    protected Response echo(Request request) {
        return null;
    }
}
