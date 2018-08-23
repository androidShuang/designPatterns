package mediation;

public abstract class AbstractMediation {
    protected ConcreteColleague1 concreteColleague1;
    protected ConcreteColleague2 concreteColleague2;

    public abstract void dosomeThing1();
    public abstract void dosomeThing2();

    public ConcreteColleague1 getConcreteColleague1() {
        return concreteColleague1;
    }

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public ConcreteColleague2 getConcreteColleague2() {
        return concreteColleague2;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }
}
