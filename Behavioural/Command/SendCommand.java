public class SendCommand implements Command {
    private Receiver receiver;

    SendCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.sendEmail();
    }
}
