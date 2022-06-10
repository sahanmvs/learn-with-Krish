package chain_of_responsibility;

public class TeamLeader extends ExpenseHandler{
    @Override
    public void approveExpense(ExpenseReport expenseReport) {
        if(expenseReport.getAmount() <= 10_000) {
            System.out.println("TeamLeader approved Expense Report No:"
                    + expenseReport.getExpenseReportNumber());
        } else {
            nextExpenseHandler.approveExpense(expenseReport);
        }
    }
}
