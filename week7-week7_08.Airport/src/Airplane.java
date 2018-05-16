import java.util.ArrayList;

public class Airplane {

    private String id;
    private int capacity;
    private ArrayList<Flight> flights;

    public Airplane(String id, int capacity){
        this.id = id;
        this.capacity = capacity;
        flights = new ArrayList<Flight>();
    }

    public String getId(){
        return id;
    }

    public void addFlight(Flight flight){
        flights.add((flight));
    }

    @Override
    public String toString(){
        String plane = String.format("%s (%d ppl)",id,capacity);
        return plane;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }
}
