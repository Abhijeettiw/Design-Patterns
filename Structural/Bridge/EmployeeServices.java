public interface EmployeeServices {
    public Employee employeeBasicDetails(String name, String phone, String email, String designation);
    public Employee employeeAddress(Employee employee, String address, String country);
    public Employee employeeCompany(Employee employee, String company);
}
