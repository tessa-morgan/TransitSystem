import java.util.ArrayList;

public class Taxi extends Car implements PublicTransit {
    private ArrayList<Passenger> passengers;

    public Taxi(String make, String model, int year, int doors, Passenger driver) {
        super(make, model, year, doors, driver);
        this.passengers = new ArrayList<>();
    }

    public Taxi(String make, String model, int year, int doors, Passenger driver, int milesDriven) {
        super(make, model, year, doors, driver, milesDriven);
        this.passengers = new ArrayList<>();
    }

    @Override
    public void drive(int distance) {
        for (Passenger p : passengers) {
            p.travel(distance);
            p.payFare(distance);
        }
        System.out.println(driver + ", who is " + driver.getAge() + ", is driving a taxi with " + passengers.size() + " passengers.");
    }

    @Override
    public void boardPassengers(ArrayList<Passenger> newPassengers) {
        // Adds passengers to the taxi
        passengers.addAll(newPassengers);
        int num = newPassengers.size();

        for (Passenger p : passengers) {
            p.travel(milesDriven);
            
            if (num > 1) {
                System.out.print(p.getName() + ", ");
                num--;
            }
            else {
                System.out.println(p.getName() + " got in a taxi.");
            }
        }
    }

    @Override
    public void disembarkPassengers(ArrayList<Passenger> leavingPassengers) {
        passengers.removeAll(leavingPassengers);
        for (Passenger p : passengers) {
            p.disembark();;
            System.out.println(p.getName() + " got out of the taxi.");
        }
    }

    @Override
    public double calculateFare(Passenger p) {
        return p.getDistance() * 1.5 + 3; // Formula for taxi fare, yikes
    }
}