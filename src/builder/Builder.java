package builder;

public abstract class Builder {
    //设置产品的不同部分
    public abstract void setPart();
    //建造产品
    public abstract Product buildProduct();
}
