import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public String getName() {
        return name;
    }

    public int getQueueLength() {
        return this.queue.size();
    }

    public ArrayList<Person> getQueue() {
        return this.queue;
    }

    public void addPerson(Person person) {
            this.queue.add(person);
    }

    public void removePerson() {
        this.queue.remove(0);
    }


}
