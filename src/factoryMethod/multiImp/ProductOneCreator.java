package factoryMethod.multiImp;

public class ProductOneCreator extends Creater{
    @Override
    public Product create() {
        return new ConcertProductOne();
    }
}
