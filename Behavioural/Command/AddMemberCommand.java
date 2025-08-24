public class AddMemberCommand implements Command {
    private Receiver receiver;

    AddMemberCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.addMember();
    }
}
