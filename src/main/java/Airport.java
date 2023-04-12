import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;
import java.util.WeakHashMap;

public class Airport {

    private ArrayList<Flight> flights;
    private static ArrayList<Passenger> passengers;

    public Airport() {
        this.flights = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    //   String flightId = null;
    //   String flightDestination = null;
        ArrayList<String> flights = new ArrayList<String>();
        flights.add("Paris");
        flights.add("New York");
        ArrayList<String> passenger = new ArrayList<String>();
        passenger.add("Theo")




        while (true) {
            System.out.println("Would you like to to" +
                    "(A) Add a new flight" +
                    "(B) Display all available flights" +
                    "(C) Add a new passenger" +
                    "(D) Book a passenger on a flight" +
                    "(E) Cancel a flight");
            String selection = scanner.nextLine();
            if (selection.equals("A"))
                System.out.println("Please enter name of new flight");
            String newFlight = scanner.nextLine();
            flights.add(newFlight);
            System.out.println(flights);

            if (selection.equals("B"))
                if (selection.equals("C"))
                               System.out.println("Please enter your Name.");
            String name = scanner.nextLine();

            System.out.println("Please enter your phone number");
            String phoneNumber = scanner.nextLine();

            System.out.println("Please enter your unique identifier");
            String uniqueIdentifier = scanner.nextLine();


            passenger.add(name);
            passenger.add(phoneNumber);
            passenger.add(uniqueIdentifier);
            System.out.println("You have successfully entered a persons details");
         //   Passenger passenger = new Passenger(name, phoneNumber, uniqueIdentifier);
        //    Flight flight = new Flight(flightId, flightDestination);
            break;
       //             if (selection.equals("D"))
       //                 if (selection.equals("E"))





            }
        }
    }



