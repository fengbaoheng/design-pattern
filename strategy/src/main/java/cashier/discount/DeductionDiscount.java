package cashier.discount;

/**
 * 满减折扣
 */
public class DeductionDiscount implements Discount {

    private final double condition;
    private final double back;

    public DeductionDiscount(double condition, double back) {
        this.condition = condition;
        this.back = back;
    }

    @Override
    public double getDiscountPrice(double price) {
        double giveBack = Math.floor(price / condition) * back;
        return price - giveBack;
    }
}
