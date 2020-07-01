package cashier.discount;

/**
 * 打折策略工厂，返回不同的打折策略
 */
public class DiscountFactory {
    public static Discount get(String strategy, Number... args) {
        switch (strategy) {
            case "deduction":
                return new DeductionDiscount(args[0].doubleValue(), args[1].doubleValue());
            case "fixed":
                return new FixedDiscount(args[0].doubleValue());
            default:
                return new NoDiscount();
        }
    }
}
