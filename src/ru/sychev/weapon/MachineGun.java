package ru.sychev.weapon;

public class MachineGun extends Gun {
    int rate_of_fire;

    public MachineGun() {
        super(30);
        rate_of_fire = 30;
    }

    public MachineGun(int maxAmmo) {
        super(maxAmmo);
        rate_of_fire = maxAmmo / 2;
        if (rate_of_fire < 1) rate_of_fire = 1;
    }

    public MachineGun(int maxAmmo, int rate_of_fire) {
        super(maxAmmo);
        this.rate_of_fire = rate_of_fire;
        if (rate_of_fire < 1) throw new IllegalArgumentException("Rate of fire must be more one");
    }

    @Override
    public void shoot() {
        for (int i = 0; i < rate_of_fire; i++){
            super.shoot();
        }
    }

    public void shoot (int n){
        for (int i = 0; i < rate_of_fire*n; i++ ){
            super.shoot();
        }
    }
}