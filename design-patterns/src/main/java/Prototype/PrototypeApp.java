package Prototype;

public class PrototypeApp {
    public static void main(String[] args) {
        Registry registry = new Registry();
        ContractBasedEmployee cBE =
                (ContractBasedEmployee) registry.getEmployee(EmployeeType.CONTRACT_BASED);
        System.out.println(cBE);
        cBE.setContractPeriod(6);
        System.out.println(cBE);

        ContractBasedEmployee cBE1 =
                (ContractBasedEmployee) registry.getEmployee(EmployeeType.CONTRACT_BASED);
        System.out.println(cBE1);
    }
}
