package practice.Structure.Decorator;

public class DataSourceDecarator implements DataSource{
    DataSource dataSource;
    String name;

    public DataSourceDecarator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void setData (String data){
        dataSource.setData(data);
    }

    public String getData (){
        return dataSource.getData();
    }
}
