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

        ArrayList<String> flights = new ArrayList<String>();
        flights.add("Paris");
        flights.add("New York");
        ArrayList<String> passenger = new ArrayList<String>();


        while (true) {
            System.out.println("Would you like to to" +
                    "(A) Add a new flight, and display all available flights" +
                    "(B) Add a new passenger" +
                    "(C) Book a passenger on a flight" +
                    "(D) Cancel a flight");
            String selection = scanner.nextLine();


            if (selection.equals("A")) { // Adding a new Flight and displaying all flights
                System.out.println("Please enter name of new flight");
                String newFlight = scanner.nextLine();
                flights.add(newFlight);
                System.out.println(flights);

            }

            if (selection.equals("B")) { // Adding a new Passenger
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
                System.out.println(passenger);
            }
                     if (selection.equals("C")) {

            }
            if (selection.equals("D")) // removing a flight
                System.out.println("Which flight would you like to remove?");
                String cancel = scanner.nextLine();
                flights.remove(cancel);
            System.out.println(flights);

            break;
        }
    }
}




