package singleton.lazy;

import org.junit.Test;
import singleton.MultiThreadTest;
import singleton.hungry.Singleton;

public class SingletonTest {
    @Test
    public void test() {
        MultiThreadTest.test(Singleton::getInstance);
    }
}