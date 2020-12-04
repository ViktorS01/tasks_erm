package ru.sychev.other;

public class Ways {
    City city;
    int price;

    public Ways (City city, int price){
        this.city = city;
        this.price = price;
    }

    public String toString(){
        return city.name + ": " + price;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ways)) {
            return false;
        }
        Ways other = (Ways) o;
        return city.equals(other.city) && price == other.price;
    }

    @Override
    public int hashCode() {
        return city.hashCode();
    }
}