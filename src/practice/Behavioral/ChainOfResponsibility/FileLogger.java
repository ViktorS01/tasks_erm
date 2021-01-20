package practice.Behavioral.ChainOfResponsibility;

public class FileLogger implements Logger{
    public int priority;
    Logger next;

    public FileLogger (int priority){
        this.priority = priority;
    }

    public void writeMessage(String message, int level) {
        if (level <= priority){
            System.out.println("Записываю в файл: " + message);
        }

        if (next != null){
            next.writeMessage(message,level);
        }
    }

    public void next(Logger next){
        this.next = next;
    }
}
