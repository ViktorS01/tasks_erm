package practice.Tasks.Chain;

public interface Otdel{
    void next(Otdel otdel);
    void toDo(String mess);
    void accept(String m);
    void notAccept(String m);
}
