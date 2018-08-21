package temp;

public abstract class AbstractClass {
    //基本方法
    protected abstract void doSomeThing();
    //基本方法,尽量设计成protect符合迪米特法则
    protected abstract void doAnyThing();

    //模板方法
    protected void templateMethod(){
        this.doSomeThing();
        this.doAnyThing();
    }

}
