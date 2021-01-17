package practice.Structure.Facade;

public class Facade {
    Power power = new Power();
    Usb usb = new Usb();
    copyUsb copyUsb = new copyUsb();

    public void onComp(){
        power.on();
        usb.load();
        copyUsb.copy(usb);
    }
}
