package uml;

/**
 * 代理主题
 */
public class Proxy implements Subject {
    /**
     * 内部持有的被代理对象
     */
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    /**
     * 调用被代理对象的方法时，对调用过程加以控制
     */
    @Override
    public void request() {
        preRequest();

        subject.request();

        afterRequest();
    }

    private void preRequest() {

    }

    private void afterRequest() {

    }
}
