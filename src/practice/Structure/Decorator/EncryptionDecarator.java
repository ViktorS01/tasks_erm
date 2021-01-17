package practice.Structure.Decorator;

public class EncryptionDecarator extends DataSourceDecarator{

    public EncryptionDecarator (DataSource dataSource){
        super(dataSource);
    }

    @Override
    public void writeData (String data){
        super.writeData(archive(data));
    }

    @Override
    public String readData (){
        return super.readData();
    }

    public String archive (String data){
        return data + "csc";
    }
}
