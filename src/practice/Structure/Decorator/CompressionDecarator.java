package practice.Structure.Decorator;

public class CompressionDecarator extends DataSourceDecarator{

    public CompressionDecarator (DataSource dataSource){
        super(dataSource);
    }

    public void setData (String data){
        super.setData(pack(data));
    }

    public String getData (){
        return super.getData();
    }

    public String pack (String data){
        return data + " + comp";
    }

}
