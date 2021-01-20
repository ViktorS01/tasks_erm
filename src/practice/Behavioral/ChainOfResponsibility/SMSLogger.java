package practice.Behavioral.ChainOfResponsibility;

public class SMSLogger implements Logger{
    public int priority;
    Logger next;

    public SMSLogger (int priority){
        this.priority = priority;
    }

    public void writeMessage(String message, int level) {
        if (level <= priority){
            System.out.println("Смс: " + message);
        }

        if (next != null){
            next.writeMessage(message,level);
        }
    }

    public void next(Logger next){
        this.next = next;
    }
}
