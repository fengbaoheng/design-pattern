package clone.deep.recursive;


import org.junit.Test;

import static org.junit.Assert.*;

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