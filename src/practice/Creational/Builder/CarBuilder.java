package practice.Creational.Builder;

public class CarBuilder implements Builder{
    Car car;
    int number;
    String engine;
    String tripComputer;
    String gps;

    public CarBuilder setSeats(int number){
        this.number = number;
        return this;
    }

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    public CarBuilder setGPS(String gps) {
        this.gps = gps;
        return this;
    }

    public Car getResult() {
        return new Car(number,engine,tripComputer,gps);
    }

    @Override
    public String toString() {
        return "CarBuilder{" +
                "car=" + car +
                ", number=" + number +
                ", engine='" + engine + '\'' +
                ", tripComputer='" + tripComputer + '\'' +
                ", gps='" + gps + '\'' +
                '}';
    }
}
