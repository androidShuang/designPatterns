package command.better;

public abstract class Command {
    protected final Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    abstract void excute();
}
