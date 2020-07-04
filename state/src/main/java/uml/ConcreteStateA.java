package uml;

/**
 * 具体状态
 */
public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        State nextState = new ConcreteStateB();
        context.setState(nextState);
    }
}
