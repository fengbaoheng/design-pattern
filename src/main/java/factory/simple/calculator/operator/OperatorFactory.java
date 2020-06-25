package factory.simple.calculator.operator;

public class OperatorFactory {
    public static Operator get(String op) {
        switch (op) {
            case "+":
                return new Add();
            case "-":
                return new Sub();
            case "*":
                return new Multiply();
            case "/":
                return new Divide();
            case "sqrt":
                return new Sqrt();
            default:
                throw new IllegalArgumentException("无法识别的操作符");
        }
    }
}
