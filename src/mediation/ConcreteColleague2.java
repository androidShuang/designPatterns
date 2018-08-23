package mediation;

public class ConcreteColleague2 extends Colleague{
    public ConcreteColleague2(AbstractMediation abstractMediation) {
        super(abstractMediation);
    }

    public void depMethod2(){
        //处理
        super.abstractMediation.dosomeThing1();
    }

    public void selfMethod2(){
        //自己处理
    }


}
