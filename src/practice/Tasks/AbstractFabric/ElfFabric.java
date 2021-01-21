package practice.Tasks.AbstractFabric;

public class ElfFabric implements Fabric{
    public Heroy createBoyBigDistantion(){
        ElfBigDist elf = new ElfBigDist();
        return elf;
    }
    public Heroy createBoySmallDistantion(){
        ElfSmallDist elf = new ElfSmallDist();
        return elf;
    }
}
