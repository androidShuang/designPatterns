package mediation;

public class ConcreteColleague1 extends Colleague{
    public ConcreteColleague1(AbstractMediation abstractMediation) {
        super(abstractMediation);
    }

    public void depMethod1(){
        //处理
        super.abstractMediation.dosomeThing1();
    }

    public void selfMethod1(){
        //自己处理
    }

}
