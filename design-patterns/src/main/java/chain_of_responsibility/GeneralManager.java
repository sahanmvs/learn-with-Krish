package chain_of_responsibility;

public class GeneralManager extends ExpenseHandler{
    @Override
    public void approveExpense(ExpenseReport expenseReport) {
        if(expenseReport.getAmount() > 10_000 && expenseReport.getAmount() <= 20_000) {
            System.out.println("General Manager approved Expense Report No:"
                    + expenseReport.getExpenseReportNumber());
        } else {
            nextExpenseHandler.approveExpense(expenseReport);
        }
    }
}
