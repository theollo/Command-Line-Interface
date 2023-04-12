import java.util.ArrayList;
import java.util.Scanner;
import java.util.WeakHashMap;

public class Airport {

    private ArrayList<Flight> flights;
    private ArrayList<Passenger> passengers;

    public Airport() {
        this.flights = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Please enter your Name.");
            String name = scanner.nextLine();

            System.out.println("Please enter your phone number");
            String phoneNumber = scanner.nextLine();

            System.out.println("Please enter your unique identifier");
            String uniqueIdentifier = scanner.nextLine();

            Passenger passenger = new Passenger(name, phoneNumber, uniqueIdentifier);

            break;

//            Flight flight = new Flight(flightId, flightDestination);
        }

    }
}


