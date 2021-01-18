package practice.Creational.Builder;

public interface Builder {
    <T> T setSeats(int number);
    <T> T setEngine(String engine);
    <T> T setTripComputer(String trip);
    <T> T setGPS(String gps);
}
