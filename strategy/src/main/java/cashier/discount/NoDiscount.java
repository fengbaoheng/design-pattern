package cashier.discount;

/**
 * 没有折扣,原价
 */
public class NoDiscount implements Discount {

    @Override
    public double getDiscountPrice(double price) {
        return price;
    }
}
