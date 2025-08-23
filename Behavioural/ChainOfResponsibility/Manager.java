public class Manager implements Handler {
    private Handler successor;
    private String leaveType;

    Manager(String leaveType, Handler successor) {
        this.leaveType = leaveType;
        this.successor = successor;
    }
    @Override
    public void getApproval() {
        if (!approvedRequest() && successor != null)
            successor.getApproval();
    }

    @Override
    public Boolean approvedRequest() {
        if (leaveType.equalsIgnoreCase("emergency")) return true;
        else return false;
    }
}
