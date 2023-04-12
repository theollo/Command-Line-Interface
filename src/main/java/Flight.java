import java.util.ArrayList;

public class Flight {
    private String flightId;
    private String flightDestination;
    private ArrayList<Flight> flights;

    public Flight(String flightId, String flightDestination) {
        this.flightId = flightId;
        this.flightDestination = flightDestination;
        this.flights = new ArrayList<>();
    }
}
