package practice.Crational.Builder;

public class CarManualBuilder implements Builder {

    Manual manual;
    int number;
    String engine;
    String tripComputer;
    String gps;


    public CarManualBuilder setSeats(int number){
        this.number = number;
        return this;
    }

    public CarManualBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarManualBuilder setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    public CarManualBuilder setGPS(String gps) {
        this.gps = gps;
        return this;
    }

    public static CarManualBuilder getCarManualBuilder(){
        return new CarManualBuilder();
    }

    public Manual getResult() {
        return new Manual(number,engine,tripComputer,gps);
    }
}
