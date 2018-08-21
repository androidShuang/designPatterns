package abstractFactory;

/**
 *
 * 抽象工厂场景：
 * 比如两个编辑器，在不同的系统下实现方式不同，也就是这两个产品因为系统的原因有约束。
 *
 *15210202831 鹿
 */

public class Client {
    public static void main(String[] args){
        AbstractCreator a1 = new CreatorProductLeveOne();
        AbstractCreator a2 = new CreatorProductLeveTwo();

        a1.createProductA();
        a1.createProductB();

        a2.createProductA();
        a2.createProductB();

    }
}
