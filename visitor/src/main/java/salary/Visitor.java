package salary;

public interface Visitor {
    void visit(Employee employee);

    void visit(Manager manager);
}
