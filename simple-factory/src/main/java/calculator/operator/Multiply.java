package calculator.operator;

public class Multiply implements Operator {
    @Override
    public Number execute(Number... args) {
        double a = args[0].doubleValue();
        double b = args[1].doubleValue();

        return a * b;
    }
}
