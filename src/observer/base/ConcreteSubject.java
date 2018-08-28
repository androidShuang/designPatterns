package observer.base;

public class ConcreteSubject extends Subject{
    public void doSomeThing(){
        super.notifyObservers();
    }
}
