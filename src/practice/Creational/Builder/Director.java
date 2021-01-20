package practice.Creational.Builder;

public class Director {
    public void makeSportsCar(CarBuilder carBuilder) {
        carBuilder.setEngine("13345").setSeats(12).setTripComputer("123 ").setGPS("1234");
    }

    public void makeHouse (HouseBuilder houseBuilder){
        houseBuilder.setHeight(56).setWeight(12);
    }
}
