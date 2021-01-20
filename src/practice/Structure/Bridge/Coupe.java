package practice.Structure.Bridge;

public class Coupe extends Car{
    public Coupe(Make make) {
        super(make);
    }

    @Override
    public void showDetails() {
        System.out.println("Coupe:");
        make.getMarka();
    }
}
