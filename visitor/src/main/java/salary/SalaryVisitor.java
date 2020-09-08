package salary;

public class SalaryVisitor implements Visitor {

    // 各级职员的工资系数
    private final double employeeRatio;
    private final double managerRatio;

    public double salary = 0;

    public SalaryVisitor(double employeeRatio, double managerRatio) {
        this.employeeRatio = employeeRatio;
        this.managerRatio = managerRatio;
    }

    @Override
    public void visit(Employee employee) {
        salary += employeeRatio * employee.getSalary();
    }


    @Override
    public void visit(Manager manager) {
        salary += managerRatio * (manager.getSalary() + manager.getBonus());
    }

    public double getSalary() {
        return salary;
    }
}
