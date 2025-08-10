public class EmployeeAbstractImpl extends EmployeeAbstract {

    @Override
    public Employee addEmployee(String name, String phone, String email, String designation, String address, String country, String company) {
        EmployeeServiceImpl employeeServices = new EmployeeServiceImpl();
        Employee employee = employeeServices.employeeBasicDetails(name, phone, email, designation);
        employeeServices.employeeAddress(employee, address, country);
        employeeServices.employeeCompany(employee, company);
        return employee;
    }
}
