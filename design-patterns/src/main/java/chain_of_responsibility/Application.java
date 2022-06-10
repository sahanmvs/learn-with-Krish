package chain_of_responsibility;

public class Application {
    public static void main(String[] args) {
        Employee employee = new Employee();
        TeamLeader teamLeader = new TeamLeader();
        GeneralManager generalManager = new GeneralManager();
        RegionalManager regionalManager = new RegionalManager();
        CEO ceo = new CEO();

        employee.setExpenseHandler(teamLeader);
        teamLeader.setExpenseHandler(generalManager);
        generalManager.setExpenseHandler(regionalManager);
        regionalManager.setExpenseHandler(ceo);

        ExpenseReport report1 = new ExpenseReport("e_1561", 1500);
        ExpenseReport report2 = new ExpenseReport("bill_821", 14500);
        ExpenseReport report3 = new ExpenseReport("ad_21", 123500);

        employee.approveExpense(report1);
        employee.approveExpense(report2);
        employee.approveExpense(report3);
    }
}
