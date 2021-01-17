package practice.Structure.Decorator;

public class FileDataSource implements DataSource {
    String name;
    String data;

    public FileDataSource(String name) {
        this.name = name;
    }

    public void writeData (String data){
        System.out.println("Write" + data);
        this.data = data;

    }
    public String readData (){
        return data;
    }
}
