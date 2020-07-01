package drink;

/**
 * 抽象装饰类
 * 通过构造函数依赖注入得到被装饰的类
 */
public abstract class DrinkDecorator extends Drink {
    protected Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public void produce() {
        drink.produce();
    }
}
