import java.sql.Array;
import java.util.ArrayList;

public class Flight {
    private String flightId;
    private String flightDestination;

    private ArrayList<Passenger> passengers;


    public Flight(String flightId, String flightDestination) {
        this.flightId = flightId;
        this.flightDestination = flightDestination;
        this.passengers= new ArrayList<>();
    }
}
