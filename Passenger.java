public class Passenger {
        private String name;
    
        // Constructor
        public Passenger(String name) {
            this.name = name;
        }
    
        // Getter for the passenger's name
        public String getName() {
            return name;
        }
    
        // Method to board a car
        public void boardCar(Car c) {
            // Attempt to add the passenger to the car
            boolean added = c.addPassenger(this);
            if (added) {
                System.out.println(name + " successfully boarded the car.");
            } else {
                System.out.println(name + " couldn't board the car. It might be full.");
            }
        }
    
        // Method to get off a car
        public void getOffCar(Car c) {
            // Attempt to remove the passenger from the car
            boolean removed = c.removePassenger(this);
            if (removed) {
                System.out.println(name + " successfully got off the car.");
            } else {
                System.out.println(name + " wasn't on the car.");
            }
        }
    }
    

