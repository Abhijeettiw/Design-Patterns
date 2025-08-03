public class EmployeeServiceImpl implements EmployeeServices {
    @Override
    public Employee employeeBasicDetails(String name, String phone, String email, String designation) {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setEmail(email);
        employee.setPhone(phone);
        employee.setDesignation(designation);
        return employee;
    }

    @Override
    public Employee employeeAddress(Employee employee, String address, String country) {
        employee.setAddress(address);
        employee.setCountry(country);
        return employee;
    }

    @Override
    public Employee employeeCompany(Employee employee, String company) {
        employee.setCompany(company);
        return employee;
    }
}
