public class Client {
    public static void main(String[] args) {
        EmployeeAbstract employeeAbstract = new EmployeeAbstractImpl();
        Employee employee = employeeAbstract.addEmployee("Abhijeet Tiwari", "7204721744", "abhijeet.tiwari@gmail.com", "SE II", "Bangalore", "India", "JPMorganChase");
        System.out.println(employee.toString());
    }
}
