package command.better;

//这里高层也就是client对Receiver松耦合了。也就是receiver并没有暴露给高层
public class Client {
    public static void main(String[] args){
        Command command = new ContreteCommand1();
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();
    }
}
