import java.util.ArrayList;

public class Car {
    // Attributes: Private for encapsulation
    private ArrayList<Passenger> passengers;
    private int maximumCapacity;

    // Constructor
    public Car(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.passengers = new ArrayList<>(maximumCapacity);
    }

    // Accessor-like method for maximum capacity
    public int getCapacity() {
        return maximumCapacity;
    }

    // Accessor-like method for remaining seats
    public int getPassengerCount() {
        return passengers.size();
    }

    // Method to add a passenger
    public boolean addPassenger(Passenger p) {
        if (passengers.size() < maximumCapacity) {
            passengers.add(p);
            return true;
        }
        return false;
    }

    // Method to remove a passenger
    public boolean removePassenger(Passenger p) {
        return passengers.remove(p);
    }

    // Method to print the passenger manifest
    public void printManifest() {
        if (passengers.isEmpty()) {
            System.out.println("This car is EMPTY.");
        } else {
            for (Passenger p : passengers) {
                System.out.println("Passenger: " + p.getName());
            }
        }
    }

    // Method to calculate remaining seats
    public int seatsRemaining() {
        return maximumCapacity - passengers.size();
    }

    // Main method for testing
    public static void main(String[] args) {
        Car car = new Car(2);  // A car with a maximum capacity of 2 passengers
        Passenger p1 = new Passenger("Alice");
        Passenger p2 = new Passenger("Bob");
        Passenger p3 = new Passenger("Charlie");

        // Trying to add passengers
        System.out.println(car.addPassenger(p1)); // Should print true
        System.out.println(car.addPassenger(p2)); // Should print true
        System.out.println(car.addPassenger(p3)); // Should print false (No seats available)

        // Print manifest
        car.printManifest();  // Should list Alice and Bob

        // Removing a passenger
        System.out.println(car.removePassenger(p1)); // Should print true

        // Print manifest again
        car.printManifest();  // Should list only Bob

        // Seats remaining
        System.out.println("Seats remaining: " + car.seatsRemaining()); // Should print 1
    }
}
