package observer.base;

import java.util.ArrayList;

public abstract class Subject {
    private ArrayList<Observer> arrayList = new ArrayList();
    public void addObserver(Observer observer){
        arrayList.add(observer);
    }

    public void deleteObserver(Observer observer){
        arrayList.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer:arrayList) {
            observer.update();
        }
    }

}
