package practice.Structure.Bridge;

public abstract class Car {
    Make make;
    public Car (Make make){
        this.make = make;
    }
    public abstract void showDetails();
}
