package factoryMethod.multiImp;

public class ProductTwoCreator extends Creater{
    @Override
    public Product create() {
        return new ConcertProductTwo();
    }
}
