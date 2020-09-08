package salary;

import java.util.LinkedList;
import java.util.List;

public class Company {
    private final List<Employee> employees = new LinkedList<>();

    public void accept(Visitor visitor) {
        employees.forEach(employee -> employee.accept(visitor));
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void remove(Employee employee) {
        employees.remove(employee);
    }
}
