package chainOfResponsibility;

public class ConcreteHandler2 extends Handler{
    @Override
    protected Level getLevel() {
        return new Level(2);
    }

    @Override
    protected Response echo(Request request) {
        return null;
    }
}
