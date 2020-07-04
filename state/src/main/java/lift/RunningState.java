package lift;

/**
 * 运行状态
 */
public class RunningState extends LiftState {
    @Override
    public void stop(Lift lift) {
        lift.setState(new StoppedState());
    }
}
