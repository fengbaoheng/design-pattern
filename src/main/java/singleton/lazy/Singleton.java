package singleton.lazy;

/**
 * 懒汉式
 * 第一次获取实例对象时才实际创建
 * 双检查锁保证线程安全
 */
public class Singleton {
    /**
     * volatile保证有序性和可见性
     */
    private static volatile Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }

        return INSTANCE;
    }
}
