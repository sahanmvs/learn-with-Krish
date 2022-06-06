package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    Map<EmployeeType, Employee> employees = new HashMap<>();

    public Registry() {
        this.initialize();
    }

    // Getting a clone object
    public Employee getEmployee(EmployeeType employeeType) {
        Employee employee = null;
        try {
            employee = (Employee) employees.get(employeeType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return employee;
    }

    private void initialize() {
        // create objects using new keyword only once
        ContractBasedEmployee cBE = new ContractBasedEmployee();
        cBE.setDepartment("Delivery");
        cBE.setSalary(10_000);
        cBE.setContractPeriod(2);

        PermanentEmployee pE = new PermanentEmployee();
        pE.setDepartment("HR");
        pE.setSalary(15_000);
        pE.setSalaryIncrement(1000);

        employees.put(EmployeeType.CONTRACT_BASED, cBE);
        employees.put(EmployeeType.PERMANENT, pE);

    }
}
