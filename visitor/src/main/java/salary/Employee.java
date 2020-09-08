package salary;

public class Employee {
    private double salary;

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
