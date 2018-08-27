package strategy.base;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void excute(){
        strategy.doSomeThing();
    }

}
