package uml;

import org.junit.Test;

import static org.junit.Assert.*;

public class MementoTest {

    @Test
    public void test() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("m1");
        careTaker.add(originator.save());


        originator.setState("m2");
        careTaker.add(originator.save());


        originator.restore(careTaker.get(0));
        assertEquals("m1", originator.getState());

        originator.restore(careTaker.get(1));
        assertEquals("m2", originator.getState());
    }
}