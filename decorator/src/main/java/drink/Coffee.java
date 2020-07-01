package drink;

/**
 * 咖啡
 * 具体构件
 */
public class Coffee extends Drink {
    @Override
    public void produce() {
        System.out.println("生产咖啡");
    }
}
