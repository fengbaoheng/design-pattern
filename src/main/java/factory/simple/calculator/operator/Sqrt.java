package factory.simple.calculator.operator;

public class Sqrt implements Operator {
    @Override
    public Number execute(Number... args) {
        double a = args[0].doubleValue();

        return Math.sqrt(a);
    }
}
