package practice.Tasks.TaskErm;

public class Tank extends War{
    int speed = 100;
    public void getUnit(){
        System.out.println("Танк");
    }
    public void walk(){
        System.out.println(name + " прошел расстояние: " + speed);
    }

    public Tank (String name, int hp, int power){
        this.name = name;
        this.hp = hp;
        this.power = power;
    }
}
