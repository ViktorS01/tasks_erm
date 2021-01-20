package practice.Structure.Bridge;

public class Hatchback extends Car{
    public Hatchback(Make make) {
        super(make);
    }

    @Override
    public void showDetails() {
        System.out.println("Hatchback:");
        make.getMarka();
    }
}
