package staff.management;

public class Director extends Manager {

    private double Budget;

    public Director(String name, String niNumber, double salary, String deptName, double budget) {
        super(name, niNumber, salary, deptName);

        this.Budget = budget;
    }

    public double getBudget() {
        return Budget;
    }

    @Override
    public double payBonus() {
        return ((this.salary/100) * 2);
    }
}
