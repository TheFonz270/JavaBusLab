import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person1;
    private Person person2;
    private Person person3;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus(2, "Princes St");
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
        busStop = new BusStop("Princess St");
    }

    @Test
    public void BusExists(){
        assertEquals(2, bus.getCapacity());
        assertEquals("Princes St", bus.getDestination());
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void NumberOfPassengers(){
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void CanAddPassengers(){
        assertEquals(0, bus.getPassengers());
        bus.addPassenger(person1);
        assertEquals(1, bus.getPassengers());
    }

    @Test
    public void CantAddTooManyPassengers(){
        assertEquals(0, bus.getPassengers());
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        bus.addPassenger(person3);
        assertEquals(2, bus.getPassengers());
    }

    @Test
    public void CanRemovePassenger(){
        assertEquals(0, bus.getPassengers());
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        bus.removePassenger();
        assertEquals(1, bus.getPassengers());
    }

    @Test

    public void canPickUpPassengersFromBusStop(){
        busStop.addPerson(person1);
        busStop.addPerson(person2);
        bus.addBusStop(busStop);
        assertEquals(2, bus.getPassengers());
        assertEquals(0, busStop.getQueueLength());

    }

}
