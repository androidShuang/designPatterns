package factoryMethod.simpImp;
//简化的简单工厂
public class Client {
    public static void main(String[] args){
        Product product = Creator.createProduct(ConcertProductOne.class);
    }
}
