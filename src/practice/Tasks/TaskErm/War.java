package practice.Tasks.TaskErm;

public abstract class War {
    int hp;
    int speed;
    int power;
    String name;
    int newHp;

    public War (String name, int hp, int power){
        this.name = name;
        this.hp = hp;
        this.power = power;
    }

    public War (){
    }

    public int Shoot (){
        if (hp > 0) {
            return power;
        }
        else return 0;
    }

    public void walk(){
        System.out.println(name + " прошел расстояние: " + speed);
    }

    public void getHit(int damage){
        newHp = hp - damage;
        if (hp > 0){
            hp = newHp;
        }
        else this.hp = 0;
    }

    public int getHp() {
        return hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public abstract void getUnit();
}
