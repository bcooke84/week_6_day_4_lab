package staff;

public class Employee {

    private String name;
    private String niNumber;
    protected double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ((name != null) && (name != "")) {
            this.name = name;
        }
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise) {
        if (raise > 0) {
        double salaryIncrease = ((this.salary / 100) * raise);
        this.salary += salaryIncrease;}
    }

    public double payBonus() {
        return this.salary/100;
    }
}
