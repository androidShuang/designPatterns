package abstractFactory;

public class CreatorProductLeveOne extends AbstractCreator{
    @Override
    public Product createProductA() {
        return new ProductA1();
    }

    @Override
    public Product createProductB() {
        return new ProduvtB1();
    }
}
