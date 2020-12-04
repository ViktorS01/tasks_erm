package ru.sychev.weapon;

public abstract class Weapon {
    int DEF_AMMO = 5;
    int ammo;
    int MAX_AMMO_DEFAULT = 6;
    int maxAmmo = MAX_AMMO_DEFAULT;


    public Weapon (int ammo, int maxAmmo){
        this.maxAmmo = maxAmmo;
        if (ammo > 0) this.ammo = ammo;
        else throw new IllegalArgumentException("ammo must be positive");
        if (ammo > maxAmmo) this.ammo = maxAmmo;
    }

    public Weapon (int ammo) {
        this(ammo, ammo);
    }

    public Weapon(){
        this.ammo = DEF_AMMO;
    }

    public void setAmmo(int ammo) {
        if (ammo > this.maxAmmo)
            this.ammo = this.maxAmmo;

        this.ammo = ammo;
    }

    abstract void shoot();

    public int ammo() {
        return ammo;
    }

    public int getAmmo() {
        return ammo;
    }

    public int reload(int ammo) {
        if (ammo > 0) setAmmo(ammo);
        else throw new IllegalArgumentException("ammo must be positive");
        return this.maxAmmo - ammo;
    }

    public int discharge() {
        final int oldAmmo = this.ammo;
        setAmmo(0);
        return oldAmmo;
    }

    public boolean isLoaded(){
        if (ammo > 0) return true;
        else return false;
    }
}
