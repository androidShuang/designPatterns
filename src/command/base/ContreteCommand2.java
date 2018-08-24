package command.base;

public class ContreteCommand2 extends Command{

    private Receiver receiver;

    public ContreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    void excute() {
        this.receiver.doSomeThing();
    }
}
