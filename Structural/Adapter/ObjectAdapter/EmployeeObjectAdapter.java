public class EmployeeObjectAdapter implements Customer {

    private Employee employee;

    @Override
    public String getName() {
        return employee.getFullName();
    }

    @Override
    public String getDesignation() {
        return employee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return employee.getOfficialLocation();
    }

    EmployeeObjectAdapter(Employee employee) {
        this.employee = employee;
    }
}
