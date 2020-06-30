package decorator.uml;

/**
 * 抽象装饰类
 */
public abstract class Decorator implements Component {

    /**
     * 被装饰的构件
     * 可通过依赖注入获得
     */
    private Component component;

    /**
     * 构造函数注入
     *
     * @param component 被装饰的构件
     */
    public Decorator(Component component) {
        this.component = component;
    }

    /**
     * setter方法注入
     *
     * @param component 被装饰的构件
     */
    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
