package practice.Structure.Adapter;

public class RoundHole {
    int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void fits (RoundPeg peg){
        if (this.radius >= peg.getRadius()){
            System.out.println("влезает");}
        else{
            System.out.println("Не влезает");
        }
    }
}
