package practice.Structure.Proxy;

public class RealImage implements Image{
    String name;

    public RealImage(String name){
        this.name = name;
        load();
    }
    public void display() {
        System.out.println("Смотрим картинку! " + name);
    }

    public void load(){
        System.out.println("Файл загружается!" + name);
    }
}
