import java.util.ArrayList;

public class Train {
    private Engine engine;
    private ArrayList<Car> cars;

    // Constructor to initialize the engine and attach cars to the train
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        // Initialize the engine
        this.engine = new Engine(fuelType, fuelCapacity);

        // Initialize the cars list and add the required number of cars
        this.cars = new ArrayList<>();
        for (int i = 0; i < nCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }

    // Accessor to return the engine
    public Engine getEngine() {
        return engine;
    }

    // Accessor to return the ith car
    public Car getCar(int i) {
        if (i >= 0 && i < cars.size()) {
            return cars.get(i);
        } else {
            throw new IndexOutOfBoundsException("Invalid car index");
        }
    }

    // Method to return the maximum total capacity across all cars
    public int getMaxCapacity() {
        int totalCapacity = 0;
        for (Car car : cars) {
            totalCapacity += car.getCapacity();  // Assuming Car has a getCapacity() method
        }
        return totalCapacity;
    }

    // Method to return the number of remaining open seats across all cars
    public int seatsRemaining() {
        int remainingSeats = 0;
        for (Car car : cars) {
            remainingSeats += car.getCapacity() - car.getPassengerCount();  // Assuming getPassengerCount() returns current passengers
        }
        return remainingSeats;
    }

    // Method to print the manifest (list of passengers in each car)
   // Method to print the manifest (list of passengers in each car)
public void printManifest() {
    for (int i = 0; i < cars.size(); i++) {
        System.out.println("Car " + (i + 1) + ":");
        cars.get(i).printManifest();  // Correct method call
    }
}

    }


