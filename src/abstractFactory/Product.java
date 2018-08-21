package abstractFactory;

public abstract class Product {
    public void shareMethod(){}//每个产品共有的方法
    public abstract void doSomeThing();//每个产品特有的方法
}
