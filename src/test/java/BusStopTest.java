import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop;
    private Person person1;
    private Person person2;
    private Person person3;

    @Before
    public void before(){
        busStop = new BusStop("Princess St");
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
    }

    @Test
    public void BusStopExists(){
        assertEquals("Princess St", busStop.getName());
        assertEquals(0, busStop.getQueueLength());
    }

    @Test
    public void NumberOfQueue(){
        assertEquals(0, busStop.getQueueLength());
    }

    @Test
    public void CanAddPerson(){
        assertEquals(0, busStop.getQueueLength());
        busStop.addPerson(person1);
        assertEquals(1, busStop.getQueueLength());
    }

    @Test
    public void CanRemovePerson(){
        assertEquals(0, busStop.getQueueLength());
        busStop.addPerson(person1);
        busStop.addPerson(person2);
        busStop.removePerson();
        assertEquals(1, busStop.getQueueLength());
    }

}
