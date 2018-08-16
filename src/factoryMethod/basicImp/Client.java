package factoryMethod.basicImp;
//基本的工厂方法模式
public class Client {
    public static void main(String[] args){
        ContereCreator contereCreator = new ContereCreator();
        Product productOne = contereCreator.createProduct(ConerteProductOne.class);

    }
}
