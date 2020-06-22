package singleton.enumeration;

import org.junit.Test;
import singleton.MultiThreadTest;

public class SingletonTest {

    @Test
    public void test() {
        MultiThreadTest.test(() -> Singleton.INSTANCE);
    }
}