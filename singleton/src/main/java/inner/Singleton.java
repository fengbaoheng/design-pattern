package inner;

/**
 * 内部类保证了延迟加载与线程安全
 */
public class Singleton {
    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }
}
