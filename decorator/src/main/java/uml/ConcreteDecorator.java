package uml;

/**
 * 具体装饰类
 */
public class ConcreteDecorator extends Decorator {
    /**
     * 构造函数注入
     *
     * @param component 被装饰的构件
     */
    public ConcreteDecorator(Component component) {
        super(component);
    }


    /**
     * 该装饰类独有的装饰方法
     */
    private void decorate() {
    }


    /**
     * 重写父类方法
     * 先调用注入组件的执行方法
     * 再调用自己独有的装饰方法
     */
    @Override
    public void operation() {
        super.operation();
        this.decorate();
    }
}
