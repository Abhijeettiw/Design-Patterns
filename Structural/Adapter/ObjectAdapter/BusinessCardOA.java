public class BusinessCardOA {
    public String printCard(Customer customer){
        return customer.getName()+"\n"+
                customer.getDesignation()+"\n"+
                customer.getAddress();
    }
}
