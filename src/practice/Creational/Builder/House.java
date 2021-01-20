package practice.Creational.Builder;

public class House {
    int height;
    int weight;

    public House(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "House{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
