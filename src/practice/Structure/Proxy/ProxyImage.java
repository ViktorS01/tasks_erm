package practice.Structure.Proxy;

public class ProxyImage implements Image{
    Image image;
    String name;

    public ProxyImage (String name){
        this.name = name;
    }

    public void display() {
        if(image == null){
            image = new RealImage(name);
        }
        image.display();
    }
}
