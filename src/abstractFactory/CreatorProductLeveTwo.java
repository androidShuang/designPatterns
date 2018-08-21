package abstractFactory;

public class CreatorProductLeveTwo extends AbstractCreator{
    //只生产产品等级为二的A产品
    @Override
    public Product createProductA() {
        return new ProductA2();
    }
    //只生产产品等级为二的B产品
    @Override
    public Product createProductB() {
        return new ProduvtB2();
    }
}
