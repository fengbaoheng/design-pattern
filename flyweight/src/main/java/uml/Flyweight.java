package uml;

import java.util.StringTokenizer;

public abstract class Flyweight {
    // 内部状态
    private String innerState;

    public Flyweight(String innerState) {
        this.innerState = innerState;
    }

    // 操作时传入外部状态，内部不会保存
    public void operate(String outerState) {

    }

    public String getInnerState() {
        return innerState;
    }


}
