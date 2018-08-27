package strategy.base;

public class Client {
    public static void main(String[] args){
        Strategy strategy = new ConcretStrategy1();
        Context context = new Context(strategy);
        context.excute();
    }
}
