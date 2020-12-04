package ru.sychev.weapon;

public class Gun extends Weapon{

    public Gun(int ammo, int maxAmmo){
        this.maxAmmo = maxAmmo;
        if (ammo > 0) this.ammo = ammo;
        else throw new IllegalArgumentException("ammo must be positive");
        if (ammo > maxAmmo) this.ammo = maxAmmo;
    }

    public Gun(int ammo) {
        super.ammo();
    }

    public Gun(){
        this.ammo = DEF_AMMO;
        this.maxAmmo = MAX_AMMO_DEFAULT;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public int getAmmo() {
        return ammo;
    }

    public boolean isLoaded(){
        if (ammo > 0) return true;
        else return false;
    }

    public void setAmmo(int ammo) {
        if (ammo > this.maxAmmo)
            this.ammo = this.maxAmmo;

        this.ammo = ammo;
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

    public void shoot(){
        if (ammo > 0){
            System.out.println("Bah!");
            ammo --;
        }
        else System.out.println("Klac..");
    }
}
