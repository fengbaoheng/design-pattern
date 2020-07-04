package lift;

/**
 * 停止状态
 */
public class StoppedState extends LiftState {
    @Override
    public void openDoor(Lift lift) {
        lift.setState(new RunningState());
    }

    @Override
    public void run(Lift lift) {
        lift.setState(new RunningState());
    }
}
