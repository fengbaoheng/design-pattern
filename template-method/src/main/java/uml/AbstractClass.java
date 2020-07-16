package uml;

/**
 * 抽象父类
 */
public class AbstractClass {
    public final void templateMethod() {
        if (hook1()) {
            primitiveOperation1();
        }

        if (hook2()) {
            primitiveOperation2();
        }
    }

    protected boolean hook1() {
        return true;
    }

    protected void primitiveOperation1() {
    }


    protected boolean hook2() {
        return true;
    }

    protected void primitiveOperation2() {
    }
}
