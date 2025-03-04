import java.util.ArrayList;

public class Bus extends Vehicle implements PublicTransit {
    private ArrayList<Passenger> passengers;

    public Bus(String make, String model, int year, Passenger driver) {
        super(make, model, year, driver);
        this.passengers = new ArrayList<>();
    }

    @Override
    public void drive() {
        System.out.println(driver + ", who is " + driver.getAge() + ", is driving a bus with " + passengers.size() + " passengers.");
    }

    @Override
    public void boardPassengers(ArrayList<Passenger> newPassengers) {
        passengers.addAll(newPassengers);
        System.out.println(newPassengers.size() + " passengers boarded the bus.");
    }

    @Override
    public void disembarkPassengers(ArrayList<Passenger> leavingPassengers) {
        passengers.removeAll(leavingPassengers);
        System.out.println(leavingPassengers.size() + " passengers left the bus.");
    }
}