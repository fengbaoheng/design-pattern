package uml;

/**
 * 具体子类的实现2
 */
public class ConcreteClass2 extends AbstractClass {
    /**
     * 步骤1的具体实现
     */
    @Override
    protected void primitiveOperation1() {

    }

    /**
     * 通过钩子不执行步骤2
     */
    @Override
    protected boolean hook2() {
        return false;
    }
}
