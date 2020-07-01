package lazy;

import org.junit.Test;
import util.MultiThreadTest;
import hungry.Singleton;

public class SingletonTest {
    @Test
    public void test() {
        MultiThreadTest.test(Singleton::getInstance);
    }
}