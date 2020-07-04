package lift;

/**
 * 电梯
 * 直接被用户操作
 */
public class Lift {
    /**
     * 记录当前电梯状态
     */
    private LiftState state;

    public Lift() {
        this.state = new StoppedState();
    }

    public void setState(LiftState state) {
        this.state = state;
    }

    /**
     * 开门
     */
    public void openDoor() {
        this.state.openDoor(this);
    }


    /**
     * 关门
     */
    public void closeDoor() {
        this.state.closeDoor(this);
    }


    /**
     * 停止运行
     */
    public void stop() {
        this.state.stop(this);
    }

    /**
     * 启动运行
     */
    public void run() {
        this.state.run(this);
    }
}
