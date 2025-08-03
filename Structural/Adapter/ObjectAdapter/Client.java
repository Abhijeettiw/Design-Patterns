public class Client {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFullName("Abhijeet Tiwari");
        employee.setJobTitle("Software Engineer II");
        employee.setOfficialLocation("Bangalore Karnataka");

        EmployeeObjectAdapter employeeAdapter = new EmployeeObjectAdapter(employee);

        BusinessCard businessCard = new BusinessCard();
        String card = businessCard.printCard(employeeAdapter);

        System.out.println(card);
    }
}
