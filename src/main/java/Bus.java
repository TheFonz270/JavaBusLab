import java.util.ArrayList;

public class Bus {

    private int capacity;
    private String destination;
    private ArrayList<Person> passengers;

    public Bus(int capacity, String destination) {
        this.capacity = capacity;
        this.destination = destination;
        this.passengers = new ArrayList<Person>();
    }

    public int getCapacity() {
        return capacity;
    }

    public String getDestination() {
        return destination;
    }

    public int getPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if(this.capacity > passengers.size()){
            this.passengers.add(person);
        }
        else {
            System.out.printf("Bus Full, no more!");
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }

    public void addBusStop(BusStop busStop) {
        int l = busStop.getQueueLength();
        for (int i = 0; i < l; i++){
            this.addPassenger(busStop.getQueue().remove(0));
        }

    }
}
