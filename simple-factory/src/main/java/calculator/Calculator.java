package calculator;

import calculator.operator.Operator;
import calculator.operator.OperatorFactory;

/**
 * 计算器
 * 通过字符串从工厂中获取具体的操作符对象
 */
public class Calculator {
    public static Number calculate(String operator, Number... args) {
        Operator op = OperatorFactory.get(operator);
        return op.execute(args);
    }
}
