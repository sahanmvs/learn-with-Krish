package chain_of_responsibility;

public class ExpenseReport {
    private String expenseReportNumber;
    private double amount;

    public ExpenseReport(String expenseReportNumber, double amount) {
        this.expenseReportNumber = expenseReportNumber;
        this.amount = amount;
    }

    public String getExpenseReportNumber() {
        return expenseReportNumber;
    }

    public double getAmount() {
        return amount;
    }
}
