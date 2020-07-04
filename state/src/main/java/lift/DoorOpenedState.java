package lift;

/**
 * 开门状态
 */
public class DoorOpenedState extends LiftState {
    @Override
    public void closeDoor(Lift lift) {
        lift.setState(new DoorClosedState());
    }
}
