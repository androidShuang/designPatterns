package command.base;

//这里高层也就是client对Receiver耦合了。
public class Client {
    public static void main(String[] args){
        Receiver receiver = new ContreteReceiver1();
        Command command = new ContreteCommand1(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();
    }
}
