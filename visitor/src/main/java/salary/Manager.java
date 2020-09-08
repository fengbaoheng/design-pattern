package salary;

public class Manager extends Employee {
    private double bonus;

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
