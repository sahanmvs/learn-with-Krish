package chain_of_responsibility;

public class CEO extends ExpenseHandler
{
    @Override
    public void approveExpense(ExpenseReport expenseReport) {
        if(expenseReport.getAmount() > 30_000) {
            System.out.println("CEO approved Expense Report No:"
                    + expenseReport.getExpenseReportNumber());
        }
    }
}
