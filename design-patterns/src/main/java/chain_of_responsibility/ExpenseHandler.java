package chain_of_responsibility;

public abstract class ExpenseHandler {
    protected ExpenseHandler nextExpenseHandler;

    public void setExpenseHandler(ExpenseHandler nextExpenseHandler) {
        this.nextExpenseHandler = nextExpenseHandler;
    }

    public abstract void approveExpense(ExpenseReport expenseReport);
}
