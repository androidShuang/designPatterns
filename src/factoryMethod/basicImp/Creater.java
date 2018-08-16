package factoryMethod.basicImp;

public abstract class Creater {
    public abstract <T extends Product> T createProduct(Class<T> c);
}
