package practice.Structure.Facade;

public class copyUsb {

    public void copy (Usb dataCheck){
        if (dataCheck.isData() == false ){
            System.out.println("Флешка отсутствует!");
        }
        System.out.println("Запускаю");
    }
}
