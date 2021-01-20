package practice.Structure.Decorator;

public class FileDataSource implements DataSource {
    String name;
    String data;

    public FileDataSource(String name) {
        this.name = name;
    }

    public void setData (String data){
        System.out.println("Write data: " + data);
        this.data = data;

    }
    public String getData (){
        return data;
    }
}
