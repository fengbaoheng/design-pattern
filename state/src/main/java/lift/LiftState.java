package lift;

/**
 * 定义电梯状态及默认实现
 */
public abstract class LiftState {
    /**
     * 开门
     */
    public void openDoor(Lift lift) {
    }


    /**
     * 关门
     */
    public void closeDoor(Lift lift) {
    }


    /**
     * 停止运行
     */
    public void stop(Lift lift) {
    }

    /**
     * 启动运行
     */
    public void run(Lift lift) {
    }
}
