package practice.Structure.Proxy;

public class ImageProxy implements Graphic{
    int extent;
    Image image;



    public ImageProxy(Image image) {
        this.image = image;
    }

    public void draw (){
        if (image == null){
            image = LoadImage(image.name);
        }
        image.draw();
    }

    private Image LoadImage(String name) {
        return image;
    }

    public int getExtent (){
        if (image == null){
            return extent;
        }
        return image.getExtent();

    }

    public void store (){
        image.store();
    }

    public void load(){
        image.load();
    }
}
