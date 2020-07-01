package cashier;

import cashier.discount.DiscountFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashierTest {

    private final double DELTA = 0.000001;

    private final double[] testData = {
            10, 1.0,
            5, 2.0,
            20, 2.0,
            40, 1.0
    };

    private final Cart cart = new Cart();
    private final Cashier cashier = new Cashier();

    public CashierTest() {
        for (int i = 0; i < testData.length; i += 2) {
            double price = testData[i];
            double quantity = testData[i + 1];

            Product product = new Product();
            product.setPrice(price);

            cart.add(product, quantity);
        }
    }

    @Test
    public void testNoDiscount() {
        double totalPrice = cashier.checkOut(cart);

        assertEquals(100.0, totalPrice, DELTA);
    }

    @Test
    public void testFixedDiscount() {
        cashier.setDiscount(DiscountFactory.get("fixed", 0.5));
        assertEquals(50.0, cashier.checkOut(cart), DELTA);

        cashier.setDiscount(DiscountFactory.get("fixed", 0));
        assertEquals(0.0, cashier.checkOut(cart), DELTA);

        cashier.setDiscount(DiscountFactory.get("fixed", 1));
        assertEquals(100.0, cashier.checkOut(cart), DELTA);
    }

    @Test
    public void testDeduction() {
        cashier.setDiscount(DiscountFactory.get("deduction", 20, 1));
        assertEquals(95.0, cashier.checkOut(cart), DELTA);

        cashier.setDiscount(DiscountFactory.get("deduction", 100, 20));
        assertEquals(80, cashier.checkOut(cart), DELTA);

        cashier.setDiscount(DiscountFactory.get("deduction", 200, 120));
        assertEquals(100, cashier.checkOut(cart), DELTA);
    }
}