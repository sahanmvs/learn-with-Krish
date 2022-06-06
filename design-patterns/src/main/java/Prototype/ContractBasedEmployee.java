package Prototype;

public class ContractBasedEmployee extends Employee{
    private int contractPeriod;

    public int getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(int contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    @Override
    public String toString() {
        return "ContractBasedEmployee{" +
                "contractPeriod=" + contractPeriod +
                '}';
    }
}
