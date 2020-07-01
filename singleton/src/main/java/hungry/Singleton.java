package hungry;

/**
 * 饿汉式
 * 类加载时创建实例对象
 */
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
