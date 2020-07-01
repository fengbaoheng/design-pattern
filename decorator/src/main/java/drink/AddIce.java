package drink;

/**
 * 加冰
 * 具体装饰类
 */
public class AddIce extends DrinkDecorator {
    public AddIce(Drink drink) {
        super(drink);
    }

    @Override
    public void produce() {
        super.produce();
        System.out.println("加冰");
    }
}
