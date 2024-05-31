package structural.adapter;

import java.util.List;

//Demo of the adapter pattern. Adapts the legacy EmployeeLdap to new Employee class
public class AdapterDemo {

    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();


        //EmployeeLdap is the legacy Employee class, you want to adapt new Employee to the legacy class
        //Employee employeeFromLdap = new EmployeeLdap("adminID", "michal", "jamula", "michal@jamula.com");


        EmployeeLdap employeeFromLdap = new EmployeeLdap("adminID", "jamula", "michal", "michal@jamula.com");

        employees.add(new EmployeeAdapterLdap(employeeFromLdap));


        //EmployeeCSV is a different legacy implementation, you want to adapt it to the new Employee class
        //Employee employeeFromCSV = new EmployeeCSV("123,bob,marley");

        EmployeeCSV employeeFromCSV = new EmployeeCSV("123,bob,marley");
        employees.add(new EmployeeAdapterCSV(employeeFromCSV));
        System.out.println(employees);


    }
}
