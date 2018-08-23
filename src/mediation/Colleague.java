package mediation;

public abstract class Colleague {
    protected AbstractMediation abstractMediation;
    public Colleague(AbstractMediation abstractMediation) {
        this.abstractMediation = abstractMediation;
    }
}
