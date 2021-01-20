package practice.Creational.Builder;

public class HouseBuilder implements HBuilder{
    House house;
    int height;
    int weight;

    public HouseBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    public HouseBuilder setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public House getResult(){
        return new House (height, weight);
    }
}
