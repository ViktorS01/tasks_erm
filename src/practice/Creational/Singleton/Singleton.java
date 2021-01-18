package practice.Creational.Singleton;

public final class Singleton {
    private static Singleton instance;

    private String value;

    private Singleton (String value){
        this.value = value;
    }

    public static synchronized Singleton getInstance(String context) {
        if (instance == null){
            instance = new Singleton(context);
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}
