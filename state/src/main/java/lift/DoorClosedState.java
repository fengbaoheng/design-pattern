package lift;

/**
 * 关门状态
 */
public class DoorClosedState extends LiftState {
    @Override
    public void openDoor(Lift lift) {
        lift.setState(new DoorOpenedState());
    }

    @Override
    public void run(Lift lift) {
        lift.setState(new RunningState());
    }
}
