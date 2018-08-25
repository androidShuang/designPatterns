package decorator.base;

public class Clinet {
    public static void main(String[] args){
        Component component = null;
        component = new ConcerteComponet();
        component = new ConcreteDecorator1(component);
        component = new ConcreteDecorator2(component);

        component.operate();


    }
}
