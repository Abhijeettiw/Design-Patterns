public class RemoveMemberCommand implements Command {
    private Receiver receiver;

    RemoveMemberCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.removeMember();
    }
}
