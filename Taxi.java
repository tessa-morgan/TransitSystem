import java.util.ArrayList;

public class Taxi extends Car implements PublicTransit {
    private ArrayList<Passenger> passengers;

    public Taxi(String make, String model, int year, int doors, Passenger driver) {
        super(make, model, year, doors, driver);
        this.passengers = new ArrayList<>();
    }

    @Override
    public void drive() {
        System.out.println(driver + ", who is " + driver.getAge() + ", is driving a taxi with " + passengers.size() + " passengers.");
    }

    @Override
    public void boardPassengers(ArrayList<Passenger> newPassengers) {
        passengers.addAll(newPassengers);
        System.out.println(newPassengers.size() + " passengers boarded the taxi.");
    }

    @Override
    public void disembarkPassengers(ArrayList<Passenger> leavingPassengers) {
        passengers.removeAll(leavingPassengers);
        System.out.println(leavingPassengers.size() + " passengers left the taxi.");
    }
}