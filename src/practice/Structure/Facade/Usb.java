package practice.Structure.Facade;

public class Usb {

    public boolean data;

    public boolean load (){
        data = true;
        return data;
    }

    public boolean onLoad(){
        data = false;
        return data;
    }

    public boolean isData() {
        return data;
    }
}
