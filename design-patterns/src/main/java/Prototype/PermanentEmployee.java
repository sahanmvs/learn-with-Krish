package Prototype;

public class PermanentEmployee extends Employee{
    private double salaryIncrement;

    public double getSalaryIncrement() {
        return salaryIncrement;
    }

    public void setSalaryIncrement(double salaryIncrement) {
        this.salaryIncrement = salaryIncrement;
    }

    @Override
    public String toString() {
        return "PermanentEmployee{" +
                "salaryIncrement=" + salaryIncrement +
                '}';
    }
}
