package strategy.cashier.discount;

/**
 * 固定折扣
 */
public class FixedDiscount implements Discount {
    /**
     * 固定折扣数
     */
    private final double discount;

    public FixedDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double getDiscountPrice(double price) {
        return discount * price;
    }
}
