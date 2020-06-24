package strategy.cashier.discount;

/**
 * 抽象折扣策略
 */
public interface Discount {
    /**
     * 获取折扣价
     *
     * @param price 原价
     * @return 折扣价
     */
    double getDiscountPrice(double price);
}
