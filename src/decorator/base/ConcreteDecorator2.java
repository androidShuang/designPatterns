package decorator.base;

public class ConcreteDecorator2 extends Decorator{

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    //自己的方法
    private void method(){

    }

    @Override
    void operate() {
        super.operate();
        this.method();
    }
}
