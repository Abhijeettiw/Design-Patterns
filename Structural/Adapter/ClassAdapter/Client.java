public class Client {
    public static void main(String[] args) {
        EmployeeClassAdapter employeeAdapter = new EmployeeClassAdapter();
        employeeAdapter.setFullName("Abhijeet Tiwari");
        employeeAdapter.setJobTitle("Software Engineer II");
        employeeAdapter.setOfficialLocation("Bangalore Karnataka");

        BusinessCard businessCard = new BusinessCard();
        String card = businessCard.printCard(employeeAdapter);

        System.out.println(card);
    }
}
