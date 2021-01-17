package practice.Crational.Builder;

public class Car {
    int number;
    String engine;
    String tripComputer;
    String gps;

    public Car(int number, String engine, String tripComputer, String gps) {
        this.number = number;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", engine='" + engine + '\'' +
                ", tripComputer='" + tripComputer + '\'' +
                ", gps='" + gps + '\'' +
                '}';
    }
}
