package practice.Tasks.AbstractFabric;

public class OrkFabric implements Fabric{
    public Heroy createBoyBigDistantion(){
        Heroy ork = new OrkBigDist();
        return ork;
    }
    public Heroy createBoySmallDistantion(){
        Heroy ork = new OrkSmallDist();
        return ork;
    }
}
