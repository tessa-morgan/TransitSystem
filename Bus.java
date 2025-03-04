import java.util.ArrayList;

public class Bus extends Vehicle implements PublicTransit {
    private ArrayList<Passenger> passengers;

    public Bus(String make, String model, int year, Passenger driver) {
        super(make, model, year, driver);
        this.passengers = new ArrayList<>();
    }

    @Override
    public void drive(int distance) {
        for (Passenger p : passengers) {
            p.travel(distance);
        }

        System.out.println(driver + ", who is " + driver.getAge() + ", is driving a bus with " + passengers.size() + " passengers.");
    }

    @Override
    public void boardPassengers(ArrayList<Passenger> newPassengers) {
        for (Passenger p : passengers) {
            p.travel(milesDriven);
        }
        passengers.addAll(newPassengers);
        System.out.println(newPassengers.size() + " passengers boarded the bus.");
    }

    @Override
    public void disembarkPassengers(ArrayList<Passenger> leavingPassengers) {
        for (Passenger p : passengers) {
            p.disembark();
        }
        passengers.removeAll(leavingPassengers);
        System.out.println(leavingPassengers.size() + " passengers left the bus.");
    }

    @Override
    public double calculateFare(Passenger p) {
        double fare;
        if (p.getAge() < 18) {
            fare = 1.50; // Discounted fare for minors
        } else {
            fare = 3.00; // Regular fare for adults
        }
        return fare;
    }
}