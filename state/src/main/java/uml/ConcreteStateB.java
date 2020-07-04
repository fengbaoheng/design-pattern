package uml;

/**
 * 具体状态
 */
public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        State nextState = new ConcreteStateA();
        context.setState(nextState);
    }
}
