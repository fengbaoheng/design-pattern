package salary;

public class Client {
    public static void main(String[] args) {
        Company company = new Company();

        Employee employee = new Employee();
        employee.setSalary(1000);
        company.add(employee);

        Manager manager = new Manager();
        manager.setSalary(1000);
        manager.setBonus(200);
        company.add(manager);

        SalaryVisitor visitor = new SalaryVisitor(1, 2);
        company.accept(visitor);

        double salary = visitor.getSalary();

        System.out.println(salary);
    }
}
