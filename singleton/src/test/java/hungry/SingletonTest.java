package hungry;

import org.junit.Test;
import util.MultiThreadTest;

public class SingletonTest {
    @Test
    public void test() {
        MultiThreadTest.test(Singleton::getInstance);
    }
}