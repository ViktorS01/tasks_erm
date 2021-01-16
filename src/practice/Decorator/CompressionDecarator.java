package practice.Decorator;

public class CompressionDecarator extends DataSourceDecarator{
    @Override
    public void writeData (String data){
        super.writeData(pack(data));
    }

    @Override
    public String readData (){
        return super.readData();

    }

    public String pack (String data){
        return data + "csc";
    }

}
