package decorator.drink;

/**
 * 加糖
 * 具体装饰类
 */
public class AddSugar extends DrinkDecorator {
    public AddSugar(Drink drink) {
        super(drink);
    }

    @Override
    public void produce() {
        super.produce();
        System.out.println("加糖");

    }
}
