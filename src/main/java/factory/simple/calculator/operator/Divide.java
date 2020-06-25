package factory.simple.calculator.operator;

public class Divide implements Operator {
    @Override
    public Number execute(Number... args) {
        double a = args[0].doubleValue();
        double b = args[1].doubleValue();
        if (b == 0) {
            throw new IllegalArgumentException("除零");
        }

        return a / b;
    }
}
