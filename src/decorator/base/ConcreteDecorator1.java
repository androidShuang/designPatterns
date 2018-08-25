package decorator.base;

public class ConcreteDecorator1 extends Decorator{

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    //自己的方法
    private void method(){

    }

    @Override
    void operate() {
        this.method();
        super.operate();
    }
}
