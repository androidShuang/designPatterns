package command.base;

public class ContreteCommand1 extends Command{

    private Receiver receiver;

    public ContreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    void excute() {
        this.receiver.doSomeThing();
    }
}
