public class Lead implements Handler {
    private Handler successor;
    private String leaveType;

    Lead(String leaveType, Handler successor) {
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
        if (leaveType.equalsIgnoreCase("sick")) return true;
        else return false;
    }

}
