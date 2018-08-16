package factoryMethod.multiImp;
//扩展的多个工厂方法模式
public class Client {
    public static void main(String[] args){
        Product productOne = (new ProductOneCreator()).create();
        Product productTwo = (new ProductTwoCreator()).create();
    }
}
