package command.base;

public class Invoker {
    private Command command;

    public Invoker() {
    }

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        this.command.excute();
    }

}
