package drink;

/**
 * 加牛奶
 * 具体装饰类
 */
public class AddMilk extends DrinkDecorator {
    public AddMilk(Drink drink) {
        super(drink);
    }

    @Override
    public void produce() {
        super.produce();
        System.out.println("加牛奶");
    }
}
