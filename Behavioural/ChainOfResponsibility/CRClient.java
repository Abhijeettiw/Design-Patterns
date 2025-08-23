public class CRClient {
    public static void main(String[] args) {
        String leaveType = "emergency";
        Director director = new Director(leaveType,null);
        Manager manager = new Manager(leaveType,director);
        Lead lead = new Lead(leaveType,manager);
        lead.getApproval();
        System.out.println(lead.approvedRequest());
        System.out.println(manager.approvedRequest());
        System.out.println(director.approvedRequest());
    }
}
