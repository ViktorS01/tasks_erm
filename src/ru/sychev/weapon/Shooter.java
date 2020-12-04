package ru.sychev.weapon;

public class Shooter {
    private String name;
    private Gun gun;

    public Shooter (String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public Gun getGun() {
        return gun;
    }

    public void shoot (){
        if (gun != null){
            gun.shoot();
        }
        else {
            System.out.println("Не могу учавстовать в перестрелке");
        }
    }
}
