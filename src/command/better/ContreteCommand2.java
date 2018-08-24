package command.better;

public class ContreteCommand2 extends Command {

    public ContreteCommand2() {
        super(new ContreteReceiver2());
    }

    public ContreteCommand2(Receiver receiver) {
        super(receiver);
    }

    @Override
    void excute() {
        super.receiver.doSomeThing();
    }
}
