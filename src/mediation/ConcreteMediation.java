package mediation;

public class ConcreteMediation extends AbstractMediation{
    @Override
    public void dosomeThing1() {
        super.concreteColleague1.depMethod1();
        super.concreteColleague2.depMethod2();
    }

    @Override
    public void dosomeThing2() {
        super.concreteColleague1.depMethod1();
        super.concreteColleague2.depMethod2();
    }
}
