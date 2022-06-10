package chain_of_responsibility;

public class Employee extends ExpenseHandler{
    @Override
    public void approveExpense(ExpenseReport expenseReport) {
        nextExpenseHandler.approveExpense(expenseReport);
    }
}
