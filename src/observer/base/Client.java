package observer.base;

public class Client {
    public static void main(String[] args){
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver();
        subject.addObserver(observer1);
        subject.doSomeThing();
    }
}
