import com.supinfo.suprails.webservice.*;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Alexandre NGUYEN on 13/10/2014.
 */
public class ClientWebService {

    public static void main(String[] args) {
        TripWebService service = new TripService().getTripWebServicePort();

        int choice;

        do {
            displayMenu();
            choice = new Scanner(System.in).nextInt();

            switch (choice) {
                case 1:
                    showTrips(service);
                    break;
                case 2:
                    processOrder(service);
                    break;

            }
        }
        while(choice != 3);
    }

    private static void displayMenu() {
        System.out.println("--Menu--");
        System.out.println("1 - Show Trips");
        System.out.println("2 - Make order");
        System.out.println("3 - Exit");
    }

    private static void showTrips(TripWebService service) {

        List<Trip> trips = service.getTrips();
        for (Trip trip : trips) {
            System.out.println("TRIP : ");
            System.out.println("ID = " + trip.getId());
            System.out.println("DEPARTURE = " + trip.getDepartureStation().getName());
            System.out.println("ARRIVAL = " + trip.getArrivalStation().getName());
            System.out.println("PRICE = " + trip.getPrice());
        }
    }

    private static void processOrder(TripWebService service) {
        Scanner scanner = new Scanner(System.in);

        CustomerOrder customerOrder = new CustomerOrder();

        customerOrder.setTrip(getTrip(service));
        customerOrder.setCustomer(getCustomer());

        service.processCustomerOrder(customerOrder);
    }

    private static Customer getCustomer() {

        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer();

        System.out.println("FIRSTNAME ? :");
        customer.setFirstName(scanner.nextLine());
        System.out.println("LASTNAME ? :");
        customer.setLastName(scanner.next());
        System.out.println("EMAIL ? : ");
        customer.setEmail(scanner.next());

        return customer;
    }

    private static Trip getTrip(TripWebService service) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What TRIP ID ?");

        Long tripId = scanner.nextLong();

        scanner.reset();

        List<Trip> trips = service.getTrips();

        Trip trip = null;
        for (Trip currentTrip : trips) {
            if(currentTrip.getId() == tripId) {
                trip = currentTrip;
            }
        }

        return trip;
    }
}
