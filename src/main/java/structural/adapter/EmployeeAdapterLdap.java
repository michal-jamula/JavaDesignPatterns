package structural.adapter;

//Adapts legacy EmployeeLdap class to new Employee class
public class EmployeeAdapterLdap implements Employee {

    private final EmployeeLdap employeeFromLdap;

    public EmployeeAdapterLdap(EmployeeLdap employeeFromLdap) {
        this.employeeFromLdap = employeeFromLdap;
    }

    @Override
    public String getId() {
        return employeeFromLdap.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeFromLdap.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeFromLdap.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeFromLdap.getMail();
    }

    @Override
    public String toString() {
        return String.format("EmployeeAdapterLdap[id=%s, firstname=%s, lastName=%s, email=%s]", getId(), getFirstName(), getLastName(), getEmail());
    }
}
