public class Engine {
        // Attributes: Private for encapsulation
        private FuelType fuelType;
        private double currentFuelLevel;
        private double maximumFuelLevel;
    
        // Constructor
        public Engine(FuelType fuelType, double maximumFuelLevel) {
            this.fuelType = fuelType;
            this.maximumFuelLevel = maximumFuelLevel;
            this.currentFuelLevel = maximumFuelLevel;  // Initialize current fuel to max fuel level
        }
    
        // Accessors
        public FuelType getFuelType() {
            return fuelType;
        }
    
        public double getCurrentFuelLevel() {
            return currentFuelLevel;
        }
    
        public double getMaximumFuelLevel() {
            return maximumFuelLevel;
        }
    
        // Method to refuel the engine
        public void refuel() {
            this.currentFuelLevel = maximumFuelLevel;
        }
    
        // Method to simulate the engine running
        public boolean go() {
            if (currentFuelLevel > 0) {
                currentFuelLevel--;  // Decrease fuel level
                System.out.println("Fuel level: " + currentFuelLevel);
                return true;
            }
            return false;
        }
    
        // Main method for testing
        public static void main(String[] args) {
            Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
            while (myEngine.go()) {
                System.out.println("Choo choo!");
            }
            System.out.println("Out of fuel.");
        }
    }
    

