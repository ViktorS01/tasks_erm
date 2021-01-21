package practice.Tasks.TaskErm;

public class Solder extends War{
    int speed = 20;
    public void getUnit(){
        System.out.println("Солдат");
    }

    public Solder (String name, int hp, int power){
        this.name = name;
        this.hp = hp;
        this.power = power;
    }
    public void walk(){
        System.out.println(name + " прошел расстояние: " + speed);
    }

}
