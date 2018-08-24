package command.better;

public class ContreteCommand1 extends Command {

    public ContreteCommand1() {
        super(new ContreteReceiver1());
    }

    public ContreteCommand1(Receiver receiver) {
        super(receiver);
    }

    @Override
    void excute() {
        super.receiver.doSomeThing();
    }
}
