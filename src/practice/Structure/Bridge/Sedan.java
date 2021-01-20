package practice.Structure.Bridge;

public class Sedan extends Car{
    public Sedan(Make make) {
        super(make);
    }

    @Override
    public void showDetails() {
        System.out.println("Sedan:");
        make.getMarka();
    }
}
