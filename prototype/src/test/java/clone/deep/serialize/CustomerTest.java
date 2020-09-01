package clone.deep.serialize;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class CustomerTest {
    @Test
    public void test() throws CloneNotSupportedException {
        Customer customer = new Customer("张三", 20, 333, "北京", "和平街", 111111);
        Customer cloned = customer.clone();

        assertNotSame(cloned, customer);
        assertEquals(cloned, customer);

        assertNotSame(cloned.getAddress(), customer.getAddress());
        assertEquals(cloned.getAddress(), customer.getAddress());
    }
}