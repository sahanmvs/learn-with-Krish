package chain_of_responsibility;

public class RegionalManager extends ExpenseHandler{
    @Override
    public void approveExpense(ExpenseReport expenseReport) {
        if(expenseReport.getAmount() > 20_000 && expenseReport.getAmount() <= 30_000) {
            System.out.println("Regional Manager approved Expense Report No:"
                    + expenseReport.getExpenseReportNumber());
        } else {
            nextExpenseHandler.approveExpense(expenseReport);
        }
    }
}
