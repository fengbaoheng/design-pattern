package cashier;

import cashier.discount.Discount;
import cashier.discount.NoDiscount;

import java.util.Map;

/**
 * 结算他
 */
public class Cashier {
    private Discount discount = new NoDiscount();

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double checkOut(Cart cart) {
        double totalPrice = 0.0;

        for (Map.Entry<Product, Double> entry : cart.getList().entrySet()) {
            final double price = entry.getKey().getPrice();
            final double quantity = entry.getValue();

            totalPrice += price * quantity;
        }

        return discount.getDiscountPrice(totalPrice);
    }
}
