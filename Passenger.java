import java.util.Objects;

public class Passenger {
    private String name;
    private int age;
    private int distance;
    private int id;

    public Passenger(String name, int age, int id) {
        this.name = name;
        this.age = age;
        distance = 0;
        this.id = id;
    }

    public void travel(int miles) {
        distance += miles;
    }

    public void disembark() {
        distance = 0;
    }

    public int getDistance() {return distance; }
    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Passenger passenger = (Passenger) obj;
        return Objects.equals(id, passenger.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}