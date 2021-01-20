package practice.Structure.Decorator;

public class EncryptionDecarator extends DataSourceDecarator{

    public EncryptionDecarator (DataSource dataSource){
        super(dataSource);
    }

    public void setData (String data){
        super.setData(archive(data));
    }

    public String getData (){
        return super.getData();
    }

    public String archive (String data){
        return data + " + enc";
    }
}
