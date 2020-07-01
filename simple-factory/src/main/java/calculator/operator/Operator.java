package calculator.operator;

/**
 * 抽象操作符
 */
public interface Operator {

    /**
     * 返回计算结果
     *
     * @param args 操作数
     * @return 计算结果
     */
    Number execute(Number... args);
}
