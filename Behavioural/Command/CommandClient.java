public class CommandClient {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command emailCommand = new SendCommand(receiver);
        Command addCommand = new AddMemberCommand(receiver);
        Command removeCommand = new RemoveMemberCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.invokeCommand(emailCommand);
        invoker.invokeCommand(addCommand);
        invoker.invokeCommand(removeCommand);
    }
}
