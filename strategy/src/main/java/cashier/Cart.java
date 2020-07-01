package cashier;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * 购物车
 * 包含每种物品及对应的数量
 */
public class Cart {
    /**
     * 商品及对应的数量
     * 数量可以为小数（重量计价产品）
     */
    @Getter
    private final Map<Product, Double> list = new HashMap<>();

    /**
     * 添加指定数量的商品
     *
     * @param product  商品
     * @param quantity 数量
     */
    public void add(Product product, Double quantity) {
        this.list.merge(product, quantity, Double::sum);
    }

    /**
     * 添加单个商品
     *
     * @param product 商品
     */
    public void add(Product product) {
        this.add(product, 1.0);
    }
}
