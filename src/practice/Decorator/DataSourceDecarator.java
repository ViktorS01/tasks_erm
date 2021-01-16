package practice.Decorator;

public class DataSourceDecarator implements DataSource{
    DataSource dataSource;
    String name;

    public DataSourceDecarator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DataSourceDecarator() {
    }

    public void writeData (String data){
        dataSource.writeData(data);
    }
    public String readData (){
        return dataSource.readData();
    }
}
